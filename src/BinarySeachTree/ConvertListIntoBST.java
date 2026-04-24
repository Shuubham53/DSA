package BinarySeachTree;

import java.util.ArrayList;

public class ConvertListIntoBST {

    public static class Node{
        int val;
        Node left ;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    public static ArrayList<Integer> convertToArray(ListNode head){
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        return arr;
    }

    public static Node constructBST(ArrayList<Integer> arr,int start,int end){
        if(start > end) return null;
        int mid = (start+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = constructBST(arr,start,mid-1);
        root.right = constructBST(arr,mid+1,end);
        return root;
    }
    public static Node sortedListToBST(ListNode head) {
        ArrayList<Integer> arr = convertToArray(head);
        return constructBST(arr,0,arr.size()-1);
    }
    public static void  preorderTraversal(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length-1;
        ListNode head = new ListNode(-10);
        ListNode a = new ListNode(-3);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(9);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;

        preorderTraversal(sortedListToBST(head));

    }
}
