package stacks.questions;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
       int[] arr = {4,8,5,2,25}; //  Output: [3, 4, 4, -1]
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
