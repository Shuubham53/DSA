package Stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
       ///  optimal one
        int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<>();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=nums2.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                map.put(nums2[i],st.pop());
            }
            if (st.isEmpty()) {
                map.put(nums2[i], -1);
            }else {
                map.put(nums2[i], st.peek());
            }

            st.push(nums2[i]);
        }

        for(int i = 0; i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }

//        /// brute force
//         int[] nge = new int[nums2.length];
//         int[] ans = new int[nums1.length];
//        Stack<Integer> st = new Stack<>();
//
//         for(int i=nums2.length-1; i>=0; i--){
//             while(!st.isEmpty() && nums2[i] >= st.peek()) st.pop();
//             if(st.isEmpty()) nge[i] = -1;
//             else nge[i] = st.peek();
//
//             st.push(nums2[i]);
//         }
//         for(int i = 0; i<nums1.length;i++){
//             for(int j=0; j <nums2.length;j++){
//                 if(nums1[i] == nums2[j]){
//                     ans[i] = nge[j];
//                 }
//             }
//         }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] result = nextGreaterElement(nums1,nums2);
        for(int ele: result){
            System.out.print(ele+" ");
        }

//        Output: [-1,3,-1]
    }
}
