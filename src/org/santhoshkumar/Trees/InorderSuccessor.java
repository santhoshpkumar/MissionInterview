package org.santhoshkumar.Trees;

/**
 * Created by sk010962 on 10/20/2015.
 */
public class InorderSuccessor {
    Node root;

    public Node getSuccessor(Node node){

        // If node has right child then get the leftmost node of the right subtree
        if (node.right != null){
            return getLeftMost(node.right);
        }
        // If right subtree is null then get the successor will be one of the ancestor node
        return getAncestor(root,node);
        // If node is the last right child then successor is null
    }

    public Node getLeftMost(Node node){
        if(node.left == null){
            return node;
        }
        Node current = node;
        while(current.left != null){
            current = current.left;
        }
        return current;
    }

    public Node getAncestor(Node root, Node node){
        if(root==null) {
            return null;
        }
        Node successor = null;
        if(root== node||(successor = getAncestor(root.left, node))!=null||(successor=getAncestor(root.right,node))!=null){

            if(successor!=null){
                if(root.left==successor){
                    return root;
                }
            }
            return root;
        }
        return null;
    }

    // Using parent link
    public Node getInOrderSuccessor(Node node){
        if(node.right != null){
            Node current = node.right;
            while(current.left != null){
                current = current.left;
            }
            return current;
        }else{
            while(node.parent != null && node == node.parent.right){
                node = node.parent;
            }
            return node.parent;
        }
    }
}
