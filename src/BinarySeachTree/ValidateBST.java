package BinarySeachTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class ValidateBST {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static boolean inorder(Node root,Node[] prev){
        if(root == null) return true;
        if(inorder(root.left,prev) == false) return false;
        if(prev[0] != null && root.val <= prev[0].val){
            return false;
        }
        prev[0] = root;
        return inorder(root.right,prev);

    }
    public static boolean isValidBST(Node root) {
        Node[] prev = new Node[1];
        return inorder(root,prev);
    }

//    public static void inorder(Node root, ArrayList<Integer> arr){
//        if(root == null) return;
//        inorder(root.left,arr);
//        arr.add(root.val);
//        inorder(root.right,arr);
//    }
//    public static boolean isValidBST(Node root) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        inorder(root,ans);
//        for(int i=1; i<ans.size();i++){
//            if(ans.get(i-1) >= ans.get(i)) return false;
//        }
//        return true;
//    }
    public static void main(String[] args) {
        Node root = new Node(6);
        Node a = new Node(2);
        Node b = new Node(8);
        Node c = new Node(9);
        Node d = new Node(14);


        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;

        System.out.println(isValidBST(root));



    }
}
