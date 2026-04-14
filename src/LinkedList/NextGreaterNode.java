package LinkedList;

import java.util.ArrayList;

public class NextGreaterNode {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static int[] nextLargerNodes(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;

        while(curr != null){
            Node temp = curr.next;
            while(temp != null){
                if(temp.val > curr.val){
                    list.add(temp.val);
                    break;
                }
                temp = temp.next;
            }
            if(temp == null) list.add(0);
            curr = curr.next;
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(8);
        Node d = new Node(4);
        Node e = new Node(5);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int[] ans = nextLargerNodes(head);
        for(int i: ans){
            System.out.print(i+" ");
        }




    }
}
