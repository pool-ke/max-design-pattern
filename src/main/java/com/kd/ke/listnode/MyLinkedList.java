package com.kd.ke.listnode;

import java.util.List;

/**
 * @program: max-design-pattern
 * @description: //TODO
 * @author: muyuan_ke
 * @create: 2021-11-05 16:43
 */
public class MyLinkedList {
    ListNode listNode;
    int size;

    public MyLinkedList() {
        size = 0;
        listNode = new ListNode(0);
    }

    public int get(int index) {
        if (index >= size || index < 0){
            return -1;
        }
        ListNode cur = listNode;
        for (int i =0;i<=index;i++){
            cur = cur.next;
        }
        return cur.val;

    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if (index >size){
            return ;
        }
        if (index <0){
            index = 0;
        }
        ListNode preNode = listNode;
        for (int i =0;i<index;i++){
            preNode = preNode.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = preNode.next;
        preNode.next = toAdd;
        size ++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0){
            return ;
        }
        ListNode preNode = listNode;
        for (int i =0;i< index;i++){
            preNode = preNode.next;
        }
        preNode.next = preNode.next.next;

        size --;
    }

//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        preOrderTraverse(root,result);
//        return result;
//    }
//
//    public void preOrderTraverse(TreeNode root, List res){
//        if (root == null){
//            return;
//        }
//        res.push(root.val);
//        preOrderTraverse(root.left,res);
//        preOrderTraverse(root.right,res);
//    }
}
