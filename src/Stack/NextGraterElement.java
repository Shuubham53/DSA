package Stack;

/*Input: arr[] = [1, 3, 2, 4]
Output: [3, 4, 4, -1]
Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGraterElement {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int n = arr.length;
        for(int i=n-1; i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            if(st.isEmpty()) ans.add(-1);
            else ans.add(st.peek());

            st.push(arr[i]);
        }
        Collections.reverse(ans);



        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
