package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if (!st.isEmpty()) {
                if((ch == ')' &&  st.peek() == '(') || (ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '[')){
                    st.pop();
                }
            }
        }

        if(!st.isEmpty()) return false;
        return true;
    }
    public static void main(String[] args) {
        String str = "()";

        System.out.println(isValid(str));

    }
}
