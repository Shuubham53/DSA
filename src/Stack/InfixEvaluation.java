package Stack;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String s = "9+4+2"; // 15
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((int)ch >= 48 && (int) ch <= 57){
                st.push((int)ch - 48);
            }else{
                if(!st.isEmpty()){
                    op.push(ch);
                }
            }
        }

    }
}
