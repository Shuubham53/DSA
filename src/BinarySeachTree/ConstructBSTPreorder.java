package BinarySeachTree;


import java.util.HashMap;
import java.util.Map;

public class ConstructBSTPreorder {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static void built(Node root,int val){
        if(root == null) return;
        if(root.val < val){
            if(root.right == null) root.right = new Node(val);
            else built(root.right,val);
        }else{
            if(root.left == null) root.left = new Node(val);
            else built(root.left,val);
        }

    }


    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        Node root = new Node(preorder[0]);
        for(int i=1; i<preorder.length;i++){
            built(root,preorder[i]);
        }

    }
}