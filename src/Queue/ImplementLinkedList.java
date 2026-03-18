package Queue;

public class ImplementLinkedList {
    public static class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }
    }
    public static class QueueLL{
        private Node head = null;
        private Node tail = null;
        private int size = 0;

        public void add(int val){
            Node newNode = new Node(val);
            if(head == null && tail == null){
                head = newNode;
                tail = newNode;
            }

            tail.next = newNode;
            tail = tail.next;
            size++;
        }
        public int remove(){
            if(head == null){
                throw new RuntimeException("Queue is empty cannot remove element");
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }
        public int peek(){
            if(head == null){
                throw new RuntimeException("Queue is empty cannot remove element");
            }
            return head.val;
        }
        public void display(){
            Node temp = head;
            while (temp !=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
        public boolean isEmpty(){
            return size==0;

        }
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(1);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
//
//        System.out.println(q.peek());
        System.out.println(q.isEmpty());


    }
}
