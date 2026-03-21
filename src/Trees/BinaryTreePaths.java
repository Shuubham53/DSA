package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static void path(Node root,List<String>ans,String s){
        if(root == null) return;
        if(root.left == null && root.right == null){
            s += root.val;
            ans.add(s);
            return;
        }
        path(root.left,ans,s+root.val+"->");
        path(root.right,ans,s+root.val+"->");
    }
    public static List<String> binaryTreePaths(Node root){
        List<String> ans = new ArrayList<>();
        path(root,ans,"");
        return ans;
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


        System.out.println(binaryTreePaths(root));



    }
}
