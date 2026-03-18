package stacks.questions;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
       int[] arr = {4,1}; //  Output: [3, 4, 4, -1] [2, 5, 2, -1, -1]
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        res[res.length-1] = -1;
        st.push(arr[arr.length-1]);
        for(int i= arr.length-2;i>=0;i--){

            while( !st.isEmpty() && arr[i] <=  st.peek()  ){
                st.pop();
            }
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        for(int i=0; i< res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
