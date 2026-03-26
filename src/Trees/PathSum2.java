package Trees;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static void pathSum(Node root,int targetSum,List<Integer> path,List<List<Integer>> ans){
        if(root == null) return;
        targetSum = targetSum-root.val;
        path.add(root.val);
        if(root.left == null && root.right == null){
            if(targetSum == 0){
                ans.add(new ArrayList<>(path));
            }
        }
        pathSum(root.left,targetSum,path,ans);
        pathSum(root.right,targetSum,path,ans);
        path.remove(path.size()-1);

    }
    public static List<List<Integer>> pathSum2(Node root, int targetSum){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        pathSum(root,targetSum,path,ans);
        return ans;

    }



    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(4);
        Node e = new Node(0);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        System.out.println(pathSum2(root, 10));


    }
}
