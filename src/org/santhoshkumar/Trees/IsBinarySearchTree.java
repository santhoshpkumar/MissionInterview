package org.santhoshkumar.Trees;

/**
 * Created by santhoshkumar on 21/10/15.
 * Determine if the Binary Tree is Binary Search Tree
 */
public class IsBinarySearchTree {
    Node root;

    public void createTree(){
        root = new Node(50);
        root.left = new Node(25);
        root.right = new Node(75);

        root.left.left = new Node(20);
        root.left.right = new Node(30);

        root.left.left.left = new Node(10);

        root.right.left = new Node(70);
        root.right.right = new Node(80);
    }

    public boolean evaluate(){
        return determine(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    //Value at each node should be lesser than the right subtree and more than the left subtree
    private boolean determine(Node node, int min, int max){
        if(node == null){
            return true;
        }

        if(node.data > min && node.data < max ){
            return (determine(node.left, min, node.data) &&
                    determine(node.right, node.data, max));
        }
        return false;
    }

}
