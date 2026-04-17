package BinarySeachTree;

import LinkedList.Basic;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class KthMinimumInBST {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    //optimal approch
    public void inorder(Node root,int[] ans){
        if(root == null) return;
        inorder(root.left,ans);
        ans[0]--;
        if(ans[0] == 0) ans[1] = root.val;
        inorder(root.right,ans);
    }
    public int kthSmallest2(Node root, int k) {
        if(root == null) return -1;
        int[] ans = new int[2];
        ans[0] = k;
        ans[1] = -1;
        inorder(root,ans);
        return ans[1];
    }

    public static void inorder(Node root, ArrayList<Integer> list){
        if(root == null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public static int kthSmallest(Node root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list.get(k-1);
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        Node a = new Node(2);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(9);


        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
        System.out.println("Kth minimum in bst: "+kthSmallest(root,2));


    }
}
