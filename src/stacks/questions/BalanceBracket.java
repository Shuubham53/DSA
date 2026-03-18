package stacks.questions;

import java.util.Stack;

public class BalanceBracket {
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(str.charAt(i));
            }else{
                if(st.isEmpty())return false;
                else{
                    if((ch == ')' && st.peek() == '(') ||
                    (ch == '}' && st.peek() == '{')||
                    (ch == ']' && st.peek() == '[')) st.pop();
                    else return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[)]";
        boolean ans = isValid(str);
        if(ans){
            System.out.println("balance");
        }else{
            System.out.println("Not balance");
        }

    }
}
