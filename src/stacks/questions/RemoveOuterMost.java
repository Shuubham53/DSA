package stacks.questions;

import java.util.Stack;

public class RemoveOuterMost {
    public static void main(String[] args) {
        String  s = "(()())(())";
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length();i++){
            char ch =  s.charAt(i);
            if(ch == '('){
               if(!st.isEmpty()){
                   ans.append(ch);
               }
                st.push(ch);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    ans.append(ch);

                }
            }


        }
        System.out.println(ans);
    }
}
