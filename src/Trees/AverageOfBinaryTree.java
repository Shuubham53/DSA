package Trees;


import java.util.*;

// traverse from bottom to up
public class AverageOfBinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static List<Double> averageOfLevels(Node root) {
        List<Double> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            double sum = 0;

            for(int i=0; i<size;i++){
                Node curr = q.remove();
                sum += curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            Double average = sum / size;
            ans.add(average);
        }
        return ans;
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

        List<Double> ans = averageOfLevels(root);
        System.out.println(ans);



    }



}
