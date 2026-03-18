package Stack;

import java.util.ArrayList;
import java.util.Stack;

/* Input: arr[] = [10, 4, 2, 20, 40, 12, 30]
Output: [-1, 10, 4, -1, -1, 40, 40]
Explanation:
For 10, no elements on the left, so answer is -1.
For 4, previous greater element is 10.
For 2, previous greater element is 4.
For 20, no element on the left greater than 20, so answer is -1.
For 40, no element on the left greater than 40, so answer is -1.
For 12, previous greater element is 40.
For 30, previous greater element is 40.*/
public class PreviousGraterElement {
    public static void main(String[] args) {
        int[] arr = {10,4,2,20,40,12,30};
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();

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
