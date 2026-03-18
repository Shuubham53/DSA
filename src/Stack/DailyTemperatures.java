package Stack;

import java.util.Stack;
/* Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]*/
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i] >= arr[st.peek()]) st.pop();
            if(st.isEmpty()) ans[i] = 0;
            else ans[i] = st.peek()-i;

            st.push(i);
        }

        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
