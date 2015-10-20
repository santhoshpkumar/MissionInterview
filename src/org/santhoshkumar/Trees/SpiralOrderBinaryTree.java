package org.santhoshkumar.Trees;
import java.util.*;

/**
 * Created by santhoshkumar on 19/10/15.
 */
public class SpiralOrderBinaryTree {
    Node root;

    public void spiralOrder(){
        if(root == null){
            return;
        }

        Queue<Node> zig = new LinkedList<Node>();
        Queue<Node> zag = new LinkedList<Node>();
        zig.offer(root);

        while(true){
            while(!zig.isEmpty()){
                Node node = zig.poll();
                System.out.print(node.data);
                if(node.right != null){
                    zag.offer(node.right);
                }
                if(node.left != null){
                    zag.offer(node.left);
                }
            }
            while(!zag.isEmpty()){
                Node node = zag.poll();
                System.out.print(node.data);
                if(node.right != null){
                    zig.offer(node.right);
                }
                if(node.left != null){
                    zig.offer(node.left);
                }
            }
            if(zig.isEmpty() && zag.isEmpty()){
                return;
            }
        }
    }

    public void createTree(){
        root = new Node(50);
        root.left = new Node(25);
        root.right = new Node(75);

        root.left.left = new Node(20);
        root.left.right = new Node(30);

        root.right.left = new Node(70);
        root.right.right = new Node(80);
    }
}
