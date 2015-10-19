package org.santhoshkumar.Trees;

/**
 * Created by santhoshkumar on 19/10/15.
 */
public class DoubleLinkedListToBinaryTree {
    DLLNode head;
    DLLNode tail;

    int size;

    public void add(int data){
        DLLNode node = new DLLNode(data);
        if(head == null) {
            head = node;
            tail = node;
        }else{
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void inOrder(DLLNode root){
        if(root == null){
            return;
        }
        inOrder(root.prev); //prev = left
        System.out.print(root.data+ " ");
        inOrder(root.next); //next = right
    }

    public DLLNode convert(int size){
        if(size == 0){
            return null;
        }
        DLLNode left = convert(size/2);
        DLLNode root = head;
        root.prev = left;
        head = head.next;
        root.next = convert(size-((size/2)-1));
        return root;
    }

}

// Doubly Linked List Node.

class DLLNode {
    DLLNode next;
    DLLNode prev;
    int data;
    DLLNode(int data){
        this.data = data;
    }
}