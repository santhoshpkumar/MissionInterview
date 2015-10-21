package org.santhoshkumar.Trees;

/**
 * Created by santhoshkumar on 21/10/15.
 *
 * Determine if the binary tree is balanced
 */
public class IsBalanced {

    Node root;

    public void createTree(){
        root = new Node(50);
        root.left = new Node(25);
        root.right = new Node(75);

        root.left.left = new Node(20);
        root.left.right = new Node(30);

        root.left.left.left = new Node(10);
        //root.left.left.left.right = new Node(20);

        root.right.left = new Node(70);
        root.right.right = new Node(80);
    }

    public boolean evaluate(){
        return determine(root);
    }

    private boolean determine(Node node){
        if(node == null){
            return true;
        }

        if(Math.abs(getHeight(node.left)-getHeight(node.right)) <= 1){
            return (determine(node.left) && determine(node.right));
        }
        return false;
    }

    private int getHeight(Node node){
        if(node == null){
            return 1;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

}
