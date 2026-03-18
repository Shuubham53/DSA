package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int[] arr = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()){
            arr[i++] = queue.poll();
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            queue.add(arr[j]);
        }
        System.out.println(queue);

//        while(!queue.isEmpty()){
//            copy.add(queue.remove());
//        }
//        System.out.println(copy);
//        while(!copy.isEmpty()){
//            int val = copy.poll();
//            queue.add(val);
//            System.out.print(val+" ");
//        }
//        System.out.println();
//        System.out.println(copy);
//
//        System.out.println(queue);
//

    }
}
