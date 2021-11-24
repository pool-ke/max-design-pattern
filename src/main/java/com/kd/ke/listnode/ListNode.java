package com.kd.ke.listnode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: max-design-pattern
 * @description: //TODO
 * @author: muyuan_ke
 * @create: 2021-11-05 16:44
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode listNode){
        this.val = val;
        this.next = listNode;
    }
    String abc = "hello";

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(null);
    }
}
