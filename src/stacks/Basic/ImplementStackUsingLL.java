package stacks.Basic;

public class ImplementStackUsingLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        private Node head = null;
        private int size = 0;

        void push(int val){
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            size++;
        }
        void displayReverse(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }

            int top = head.val;
            head = head.next;
            size--;

            return top;
        }
        void display(){
            displayRec(head);
        }

        void displayRec(Node h){
            if(h == null) return;

            displayRec(h.next);
            System.out.print(h.val + " ");
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(12);
        s.push(23);
        s.push(53);
        s.push(11);
        s.displayReverse();
        System.out.println();
        s.display();
        s.pop();
        System.out.println();
        s.display();


    }
}
