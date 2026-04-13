package LinkedList;

import java.util.Stack;

class AddTwoNumber2 {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Helper to create list from array
    public static Node createList(int[] arr) {
        Node dummy = new Node(-1);
        Node curr = dummy;

        for (int val : arr) {
            curr.next = new Node(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Print list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int carry = 0;

        Node temp = l1;
        while(temp != null){
            st1.push(temp.val);
            temp = temp.next;
        }
        temp = l2;
        while(temp != null){
            st2.push(temp.val);
            temp = temp.next;
        }
        Node head = null;
        while(!st1.isEmpty() || !st2.isEmpty() || carry != 0){
            int val1 = 0;
            int val2 = 0;
            if(!st1.isEmpty()){
                val1 = st1.pop();
            }
            if(!st2.isEmpty()){
                val2 = st2.pop();
            }
            int sum = val1+val2+carry;
            carry = sum / 10;
            int digit = sum % 10;
            Node node = new Node(digit);
            node.next = head;
            head = node;
        }
        return head;
    }


    public static void main(String[] args) {

        Node l1 = createList(new int[]{2, 4, 3});
        Node l2 = createList(new int[]{5, 6, 4});

        Node result = addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}

