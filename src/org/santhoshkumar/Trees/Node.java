package org.santhoshkumar.Trees;

/**
 * Created by sk010962 on 10/20/2015.
 */
public class Node{
    Node left;
    Node right;
    Node parent;
    Node sibling;
    int data;
    Node(int data){
        this.data = data;
    }
}