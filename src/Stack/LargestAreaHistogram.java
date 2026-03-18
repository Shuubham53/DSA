package Stack;

import java.util.Stack;

/*
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.*/
public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int n = arr.length;
        int[] nse = new int[n];   // 1 6 2 2 6 6
        int[] pse = new int[n];   // -1 -1 1 5 1 2
        Stack<Integer> st = new Stack<>();

        // Calculating next smaller element
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() &&  arr[st.peek()] >= arr[i]) st.pop();
            if(st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();

            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        // Calculating previous smaller element
        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() &&  arr[st.peek()] >= arr[i]) st.pop();
            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();

            st.push(i);
        }


        int max = -1;
        for(int i=0; i<n;i++){
            int area = arr[i]*(nse[i]-pse[i]-1);
            max = Math.max(area,max);
        }
        System.out.println(max);



    }
}
