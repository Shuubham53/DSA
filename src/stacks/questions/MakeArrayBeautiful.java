package stacks.questions;

import java.util.Stack;

public class MakeArrayBeautiful {


    public static void main(String[] args) {
        int[] arr = {1,-1};
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length;i++){
            if(arr[i] >0){
                st.push(arr[i]);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        System.out.println(st);
    }
}
