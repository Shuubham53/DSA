package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public  static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Node> q = new ArrayDeque<>();;

        q.add(root);
        while (!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> levelAns = new ArrayList<>();
            while(levelSize != 0){
                Node temp = q.poll();
                levelAns.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                levelSize--;
            }
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

        List<List<Integer>> ans = levelOrder(root);
        for (List ele : ans){
            System.out.println(ele);
        }


    }
}
