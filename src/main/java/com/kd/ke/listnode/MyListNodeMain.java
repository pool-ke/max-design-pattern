package com.kd.ke.listnode;

/**
 * @program: max-design-pattern
 * @description: //TODO
 * @author: muyuan_ke
 * @create: 2021-11-05 16:45
 */
public class MyListNodeMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        int i = myLinkedList.get(1);
        System.out.println(i);
        myLinkedList.deleteAtIndex(1);
        int j = myLinkedList.get(1);
        System.out.println(j);


    }
    public String reverseStr(String s, int k) {
        int len = s.length();
        char[] array = s.toCharArray();
        for (int i = 0;i<len;i = i+2*k){
            int firstK = Math.min(i+k-1,len-1);
            int left = i;
            int right = firstK-1;
            while (left < right){
                char tmp = array[right];
                array[right] = array[left];
                array[left] = tmp;
                left ++;
                right --;
            }
        }
        return new String(array);
    }

//    public String replaceSpace(String s) {
//        StringBuilder res = new StringBuilder();
//        for (int i =0;i<s.length();i++){
//            if (' '.equals(s.charAt(i))){
//                res.append("%20");
//            }else{
//                res.append(s.charAt(i));
//            }
//        }
//        return res.toString();
//    }
}
