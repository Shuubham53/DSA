package LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        static Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail  = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head == null){
                insertAtEnd(val);
            }else{
                temp.next = head;
                head = temp;
            }
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int length(){
            int count = 0;
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        void insertAt(int idx , int val){
            Node newNode = new Node(val);
            if(idx == 0){
                insertAtBeginning(val);
                return;
            }
            else if(idx == length()-1){
                insertAtEnd(val);
                return;
            }else if(idx < 0 || idx >= length()){
                System.out.println("index is : "+idx);
                System.out.println("size is : "+length());
                System.out.println("Invalid Index");
            }
            Node temp = head;
            for(int i = 1; i<=idx-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        void deleteAt(int idx){

            Node temp = head;
            if(idx == 0){
                head = head.next;
            }
            for(int i=0; i<idx-1;i++){
                temp = temp.next;
            }
            if (idx == length() - 1) { //deleting last element
                temp.next = temp.next.next;
                tail = temp;
            }else{
                temp.next = temp.next.next;
            }

        }
        Node nthNode(int idx){
            Node temp = head;
            for(int i = 0; i<idx;i++){
                temp = temp.next;
            }
            return temp;
        }

    }


    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(15);
        ll.insertAtEnd(20);
//        ll.display();
        ll.insertAt(2,100);

//        ll.display();
//
//        int n = 5;
//        int m = ll.length()-n;
//
//        Node ans = ll.nthNode(m);
//        System.out.println(ans.data);

        StringBuilder str = new StringBuilder();
        str.append(1);
        str.append(0);
        str.append(1);
        System.out.println(str);
//





    }
}
