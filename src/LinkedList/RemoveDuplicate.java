package LinkedList;

public class RemoveDuplicate {
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

    public static Node removeDuplicate(Node head){
        if(head == null && head.next == null) return head;
        Node temp = head;
        while(temp.next != null){
            if(temp.val == temp.next.val) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return head;
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
//        Node ans = removeDuplicate(head);
//        display(ans);

        Node curr = head;

        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = curr.next.next;
        }

        display(head);
        System.out.println();





    }
}
