package com.kd.ke.collection;

import java.util.Objects;
import java.util.Set;

/**
 * @program: max-design-pattern
 * @description: 自定义实现HashMap
 * @author: muyuan_ke
 * @create: 2021-10-08 19:01
 */
public class MyHashMap<K,V> implements MyMap<K,V>{
    //初始默认容量
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
    //最大容量
    static final int MAXIMUM_CAPACITY = 1 << 30;

    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    transient  Node<K,V>[] table;

    transient Set<MyMap.Entry<K,V>> entrySet;

    transient int size;

    transient int modCount;

    int threshold;

    final float loadFactor;

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public MyHashMap() {
        this.loadFactor = DEFAULT_LOAD_FACTOR;
    }

    public MyHashMap(int initialCapacity,float loadFactor){
        this.loadFactor = loadFactor;
        this.threshold = tableSizeFor(initialCapacity);
    }

    public MyHashMap(int initialCapacity){
        this(initialCapacity,DEFAULT_LOAD_FACTOR);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V put(K key, V value) {
        return putValue(hash(key),key,value);
    }

    public final V putValue (int hash, K key,V value){
        Node<K,V>[] tab;
        Node<K,V> p;
        int n,i;
        if ((tab = table) == null || (n = tab.length) == 0){
            n = (tab = resize()).length;
        }
        if ((p = tab[i = (n-1) & hash]) == null){
            tab[i] = newNode(hash,key,value,null);
        }else {
            Node<K,V> e;
            K k = p.key;
            if (p.hash == hash && (k == key) || (key !=null && key.equals(k))){
                e = p;
            }else {
                for (int binCount = 0;;++binCount){
                    if ((e = p.next) == null){
                        p.next = newNode(hash,key,value,null);
                        // 大于树阈值，则进行树划
                        break;
                    }
                    if (e.hash == hash && ((k = e.key) == key) ||(key != null && key.equals(k))){
                        break;
                    }
                    p = e;
                }
            }
            if (e !=null){
                V oldValue = e.value;
                e.value = value;
                return oldValue;
            }
        }

        ++ modCount;
        if ( ++size > threshold){
            resize();
        }
        return null;

    }

    //Node数组的初始化和扩容方法
    public final Node<K,V>[] resize(){
        return (Node<K,V>[])new Node[DEFAULT_INITIAL_CAPACITY];
    }

    Node<K,V> newNode(int hash,K key,V value,Node<K,V> next){
        return new Node<>(hash,key,value,next);
    }

    @Override
    public V get(Object key) {
        Node<K,V> e;
        return (e = getNode(hash(key),key)) == null ? null :e.value;
    }

    public final Node<K,V> getNode(int hash,Object key){
        Node<K,V>[] tab;Node<K,V> first,e;int n;K k;
        if ((tab = table) != null && (n = tab.length)>0 && (first = tab[(n-1) & hash]) != null){
            k = first.key;
            if (first.hash == hash && (k == key) ||(key != null && key.equals(k))){
                return first;
            }
            if ((e = first.next) != null){
                do {
                    if (e.hash == hash && ((k = e.key) == key) ||(key != null && key.equals(k))){
                        return first;
                    }
                } while ((e = e.next) != null);
            }
        }
        return null;
    }

    public static final int hash(Object key){
        int h;
        return key == null ? 0 :(h = key.hashCode())^(h >>> 16);
    }

    static class Node<K,V> implements MyMap.Entry<K,V>{
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public final K getKey() {
            return key;
        }

        @Override
        public final V getValue() {
            return value;
        }

        @Override
        public V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        @Override
        public final boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (o instanceof MyMap.Entry){
                MyMap.Entry e = (MyMap.Entry) o;
                return Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getValue());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }
    }
}
