package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static boolean isCompleteTree(Node root){
        if(root == null ) return true;
        Queue<Node> queue = new LinkedList<>();
        boolean isNullSeen = false;
        queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.remove();
            if(isNullSeen && node != null) return false;
            if(node == null) isNullSeen = true;
            if(node != null) queue.add(node.left);
            if(node != null) queue.add(node.right);
        }
        return true;
    }




    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        System.out.println(isCompleteTree(root) ? "it is complete binary tree" : "it is incomplete binary tree");

    }
}
