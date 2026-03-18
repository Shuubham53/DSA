package Stack;

import java.util.Stack;

public class MinStack {
    public static class Node{
        private int val;
        private int min;
        private Node next;
        public Node(int val,int min,Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    public static class Stack{
        Node head;

        public void push(int val){
            if(head == null){
                Node newNode = new Node(val,val, null);
                head = newNode;
            }else{
                Node newNode = new Node(val,Math.min(val,head.min), head);
                head = newNode;
            }
        }
        public void pop(){
            if(head == null) return;
            head = head.next;

        }
        public int peek(){
            if(head == null) return -1;
            return head.val;
        }

        public int getMin(){
            if(head == null) return -1;
            return head.min;
        }
        public void displayRec(Node head){
            if(head == null) return;

            displayRec(head.next);
            System.out.print(head.val+" ");
        }
        public void display(){
           displayRec(head);
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.push(8);
        st.push(6);
        st.push(2);

        System.out.println(st.getMin());
        System.out.println();
        st.pop();
        System.out.println(st.getMin());
    }
}
