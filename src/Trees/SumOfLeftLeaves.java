package Trees;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// traverse from bottom to up
public class SumOfLeftLeaves {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public int sumOfLeftLeaves(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        int sum = 0;
        while(!q.isEmpty()){

            Node curr = q.remove();
            if(curr.left != null){
                if(curr.left.left == null && curr.left.right == null) sum += curr.left.val;
            }
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);

        }
        return sum;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        Node a = new Node(9);
        Node b = new Node(20);
        Node c = new Node(15);
        Node d = new Node(7);
        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;




    }



}
