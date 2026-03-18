package Stack;

import java.util.Stack;

import static java.lang.Integer.parseInt;

/* Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.*/
public class BaseBall {
    public static void main(String[] args) {
        String[] str = {"5","2","C","D","+"};
        Stack<Integer> st = new Stack<>();
        int result = 0;

        for(int i=0; i<str.length;i++){
           if(str[i].equals("C")){
               int val = st.pop();
           } else if (str[i].equals("D")) {
               int val = st.peek();
               st.push(val*2);
           }else if(str[i].equals("+")){
               int ele1 = st.pop();
               int ele2 = st.pop();
               st.push(ele2);
               st.push(ele1);
               st.push(ele1+ele2);
           }else{
               st.push(Integer.parseInt(str[i]));
           }

        }

        while(!st.isEmpty()){
            result += st.pop();
        }

        System.out.println(result);
    }
}
