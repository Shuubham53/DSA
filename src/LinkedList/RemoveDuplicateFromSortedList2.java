package LinkedList;

import java.util.Scanner;

public class RemoveDuplicateFromSortedList2 {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static Node removeDuplicate(Node head, int n){

        Node slow = head;
        Node fast = head;

        for(int i=1; i<=n;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = slow.next;
            return head;
        }

        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;




    }
}
