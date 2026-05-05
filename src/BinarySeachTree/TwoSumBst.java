package BinarySeachTree;

import java.util.ArrayList;
import java.util.List;

public class TwoSumBst {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static void morrisTraversal(Node root, List<Integer> list){
        Node curr = root;

        while(curr != null){
            if(curr.left != null){
                Node prev = curr.left;
                while(prev.right != null && prev.right != curr) prev = prev.right;
                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }else{
                    prev.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                list.add(curr.val);
                curr = curr.right;
            }
        }
    }
    public static boolean findTarget(Node root, int k) {
        List<Integer> list = new ArrayList<>();
        morrisTraversal(root,list);
        int start = 0;
        int end = list.size()-1;
        while(start < end){
            int sum = list.get(start) + list.get(end);
            if(sum == k) return true;
            else if(sum > k) end--;
            else start++;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        Node a = new Node(2);
        Node b = new Node(9);
        Node c = new Node(8);
        Node d = new Node(14);


        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
        System.out.println(findTarget(root,11) ? "Sum exist" : "Sum does not exist");



    }
}
