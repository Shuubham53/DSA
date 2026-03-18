package Stack;

import java.util.ArrayList;
import java.util.Stack;

/* Input: arr[] = [100, 80, 90, 120]
Output: [1, 1, 2, 4]*/
public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100,80,90,120};
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i=0; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            if(st.isEmpty()) ans.add(i+1);
            else ans.add(i-st.peek());
            st.push(i);
        }

        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
