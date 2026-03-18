package Stack;


/*Input: arr[] = [1, 6, 2]
Output: [-1, 1, 1]
Explanation:
For 1, there is no element on the left, so answer is -1.
For 6, previous smaller element is 1.
For 2, previous smaller element is 1. */

import java.util.ArrayList;
import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int[] arr = {8, 8 ,2 ,2, 4, 9, 1, 1, 5, 10};
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && st.peek() >= arr[i]) st.pop();

            if(st.isEmpty()) ans.add(-1);
            else ans.add(st.peek());

            st.push(arr[i]);
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele : ans){
            System.out.print(ele+" ");
        }


    }
}
