package LinkedList;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveNode {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node after = null;

        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public static Node removeNodes(Node head) {
        if(head == null || head.next == null) return head;
        head = reverse(head);
        Node dummy = new Node(-1);

        Node temp = head;
        Node curr = dummy;
        int max = Integer.MIN_VALUE;
        while(temp != null){
            if(temp.val >= max){
                max = temp.val;
                curr.next = temp;
                curr = curr.next;
                temp = temp.next;
            }else{
                temp = temp.next;
            }
        }
        curr.next = null;

        return reverse(dummy.next);

    }
        static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
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
       head =  removeNodes(head);
       display(head);






    }
}
