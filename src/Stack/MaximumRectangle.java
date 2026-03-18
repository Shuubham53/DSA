package Stack;

import java.util.Stack;

public class MaximumRectangle {
    public static void main(String[] args) {
        char[][]  matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int[] heights = new int[matrix[0].length];
        for(int i=0; i<matrix[0].length; i++){
            heights[i] = matrix[0][i] - '0';
        }
        int max = LargestHistogram(heights);
        for(int i=1; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == '1'){
                    heights[j] += 1;
                }else heights[j] = 0;
            }
            int currentMax = LargestHistogram(heights);
            max = Math.max(currentMax,max);
        }
        System.out.println(max);
    }

    private static int LargestHistogram(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])st.pop();
            if(st.isEmpty())  pse[i] = -1;
            else pse[i] = st.peek();

            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        for(int i=n-1;i>=0;i--){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])st.pop();
            if(st.isEmpty())  nse[i] = n;
            else nse[i] = st.peek();

            st.push(i);
        }

        int max = -1;
        for(int i=0; i<n;i++){
            int area = arr[i]*(nse[i]-pse[i]-1);
            max = Math.max(area,max);
        }
        return max;
    }
}
