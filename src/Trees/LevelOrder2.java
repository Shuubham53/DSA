package Trees;


import java.util.*;

// traverse from bottom to up
public class LevelOrder2 {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
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

        List<List<Integer>> ans = levelOrder2(root);
        for (List ele : ans){
            System.out.println(ele);
        }


    }


    private static List<List<Integer>> levelOrder2(Node root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;
        Queue<Node> q = new ArrayDeque<>();

        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();

            List<Integer> levelAns = new ArrayList<>();
            while (level != 0){
                Node currRoot = q.remove();
                levelAns.add(currRoot.val);
                if(currRoot.left != null) q.add(currRoot.left);
                if(currRoot.right != null) q.add(currRoot.right);
                level--;
            }
            ans.addFirst(levelAns);

        }
        return ans;
    }
}
