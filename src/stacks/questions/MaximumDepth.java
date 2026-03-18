package stacks.questions;

import java.util.Stack;

public class MaximumDepth {
    public static void main(String[] args) {
        String s = "()(())((()()))";


// METHOD 1

//        int currentDepth = 0;
//        int maxDepth = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(ch == '('){
//                currentDepth++;
//            }else if(ch == ')'){
//                currentDepth--;
//            }
//            maxDepth = Math.max(maxDepth,currentDepth);
//        }
//        System.out.println(maxDepth);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //METHOD 2
        Stack<Character> st = new Stack<>();
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                maxDepth = Math.max(maxDepth,st.size());
            }else if(ch == ')'){
                st.pop();
            }

        }
        System.out.println(maxDepth);


    }
}
