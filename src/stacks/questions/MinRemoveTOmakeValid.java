package stacks.questions;

import java.util.HashSet;
import java.util.Stack;

public class MinRemoveTOmakeValid {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
       char[] set = s.toCharArray();
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<s.length();i++){
            char ch =  s.charAt(i);
            if(ch == '('){
                st.push(i);
            }else{
                if(!st.isEmpty()  && ch == ')'){
                    st.pop();
                }
                else if(st.isEmpty() &&  ch == ')' ) set[i] ='*';
            }
        }
        while (!st.isEmpty()) {
            set[st.pop()] = '*';
        }
        StringBuilder ans = new StringBuilder();
        for(char ele: set){
            if(ele != '*'){
                ans.append(ele);
            }
        }
        System.out.println(ans.toString());

    }
}
