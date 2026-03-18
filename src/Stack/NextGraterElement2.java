package Stack;

import java.util.Stack;

public class NextGraterElement2 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};

        int[] ans = nextGreaterElements(arr);
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int ele : ans){
            System.out.print(ele+" ");
        }
    }

    private static int[] nextGreaterElements(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i= arr.length-1; i >=0; i--){
            st.push(arr[i]);
        }

        for(int i=0; i<arr.length;i++){
            while(!st.isEmpty() &&  st.peek() <= arr[i]) st.pop();
            if(!st.isEmpty()) ans[i] = st.peek();
            else ans[i] = -1;

            st.push(arr[i]);
        }
        return ans;
    }
}
