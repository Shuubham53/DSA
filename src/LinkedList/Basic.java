package LinkedList;



public class Basic{

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
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node after = null;

        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }


    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(5);
        Node f = new Node(1);
        Node g = new Node(2);





        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node t1 = a;
        Node t2 = a.next;
        Node t3 = a.next.next;
        int[] ans = {-1,-1};
        int idx = 1;
        int firstIdx = -1;
        int lastIdx = -1;
        int minDistance = Integer.MAX_VALUE;
        while (t3 != null){
            if((t2.data > t1.data && t2.data > t3.data) || (t2.data < t1.data && t2.data < t3.data)){
                if(firstIdx == -1){
                    firstIdx = idx;
                }
                int dis = idx - lastIdx;
                lastIdx = idx;
                minDistance = Math.min(minDistance,dis);
            }
            idx++;
            t1 = t1.next;
            t2 = t2.next;
            t3 = t3.next;
        }

        ans[0] = lastIdx - firstIdx;
        ans[1] = minDistance;
        for(int ele : ans){
            System.out.print(ele+" ");
        }

    }
}
