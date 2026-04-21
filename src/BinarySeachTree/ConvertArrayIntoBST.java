package BinarySeachTree;

import Trees.PreInPostTraversal;

public class ConvertArrayIntoBST {

    public static class Node{
        int val;
        Node left ;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static Node constructTree(int[] arr , int start,int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = constructTree(arr,start,mid-1);
        root.right = constructTree(arr,mid+1,end);
        return root;
    }
    public static void  preorderTraversal(Node root){
        if(root == null) return;

        preorderTraversal(root.left);
        System.out.print(root.val+" ");
        preorderTraversal(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length-1;

        preorderTraversal(constructTree(arr,0,n));

    }
}
