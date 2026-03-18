package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/* Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.*/
public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {5,10,-5};

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int ele: arr){

            while(ele < 0 && !st.isEmpty() && st.peek() > 0) {
                if(st.peek() < -ele) {
                    st.pop(); // top explodes
                } else if(st.peek() == -ele) {
                    st.pop(); // both explode
                    break;
                } else {
                    break;// incoming asteroid explodes
                }
            }
            st.push(ele);

        }
        int n = st.size();
        int[] result = new int[n];
        for(int i = n-1; i >=0; i--) {
            result[i] = st.pop();
        }

        for(int ele: result){
        System.out.print(ele+" ");
    }
    }
}
