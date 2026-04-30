package LinkedList;



public class AlternateConnection {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static void alternate(Node head){
        Node t1 = head;
        while (t1 != null){
            Node t2 = t1.next;
            Node newNode = new Node(t1.data);
            t1.next = newNode;
            t1 = t1.next;
            t1.next = t2;
            t1 = t2;
        }


    }


    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        alternate(a);
        display(a);




    }
}
