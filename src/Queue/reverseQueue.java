package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);  // 1 2 3 4 5
       reverse(q);


    }
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()) return;
        int ele = q.remove();
        reverse(q);
        System.out.print(ele+" ");
    }
}
