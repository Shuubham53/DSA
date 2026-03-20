package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderZigZag {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public  static List<List<Integer>> zigzagTraversal(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        boolean isleft = true;

        while(!q.isEmpty()){

            int level = q.size();
            List<Integer> levelAns = new ArrayList<>();
            while(level != 0){
                Node node =  q.peek();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);

                if(isleft){
                    levelAns.add(node.val);
                }else{
                    levelAns.addFirst(node.val);
                }
                q.remove();
                level--;
            }
            isleft = !isleft;
            ans.add(levelAns);
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

        List<List<Integer>> ans = zigzagTraversal(root);
        System.out.println(ans);



    }
}
