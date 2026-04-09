package LinkedList;

import java.util.LinkedList;

public class MergeTwoSortedList {
    public static class Node{
        int val;
        Node next;

        Node(int data){
            this.val = data;
        }
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static Node mergeList(Node list1,Node list2){
        if(list1 == null && list2 == null) return null;
        Node head = new Node(-1);
        Node temp = head;
        Node t1 = list1;
        Node t2 = list2;

        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                temp.next = t1;
                t1 = t1.next;
                temp = temp.next;
            }else{
                temp.next = t2;
                t2 = t2.next;
                temp = temp.next;
            }
        }
        if(t1 == null) temp.next = t2;
        if(t2 == null) temp.next = t1;
        return head.next;
    }
    public static void main(String[] args) {
        Node list1 = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node list2 = new Node(1);
        Node e = new Node(3);
        Node f = new Node(4);

        list1.next = b;
        b.next = c;
        list2.next = e;
        e.next = f;
        display(mergeList(list1,list2));

    }
}
