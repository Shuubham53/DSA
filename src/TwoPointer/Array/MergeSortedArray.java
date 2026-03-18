package TwoPointer.Array;

import java.util.Arrays;
///  MERGE TWO SORTED ARRAY
public class MergeSortedArray {
    public static void main(String[] args) {

//        int[] num1 = {1,2,3,0,0,0}; //  Output: [1,2,2,3,5,6]
//        int m = 3;
//        int[] num2 = {2,5,6};
//        int n = 3;

        int[] num1 = {-1,0,0,3,3,3,0,0,0}; //  Output: [1,2,2,3,5,6]
        int m = 6;
        int[] num2 = {1,2,2};
        int n = 3;
        int i = 0;
        int j = 0;

        while(i < m+n && j < n){
            if(num1[i] != 0 ){
                i++;
            }
            else if( num1[i] == 0){
                int temp  = num1[i];
                num1[i] = num2[j];
                num2[j] = temp;
                i++;
                j++;

            }
        }
        Arrays.sort(num1);
        for(int ele: num1){
            System.out.print(ele+" ");
        }

    }
}
