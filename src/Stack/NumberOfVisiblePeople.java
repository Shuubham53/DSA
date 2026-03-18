package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*Input: heights = [10,6,8,5,11,9]
Output: [3,1,2,1,1,0]
Explanation:
Person 0 can see person 1, 2, and 4.
Person 1 can see person 2.
Person 2 can see person 3 and 4.
Person 3 can see person 4.
Person 4 can see person 5.
Person 5 can see no one since nobody is to the right of them.*/
public class NumberOfVisiblePeople {
    public static void main(String[] args) {
        int[] arr = {10,6,8,5,11,9};
        Deque<Integer> st = new ArrayDeque<>();

        int n = arr.length;
        int[] ans = new int[n];
        st.push(n-1);
        ans[n-1] = 0;

        for(int i=n-2; i>=0; i--){
            int count = 0;
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]){
                count++;
                st.pop();
            }
           if(!st.isEmpty()) count++;
           ans[i] = count;
            st.push(i);
        }

        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
