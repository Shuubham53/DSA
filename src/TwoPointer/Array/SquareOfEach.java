package TwoPointer.Array;

import java.util.Arrays;

/// SQUARE FOR EACH NUMBER
public class SquareOfEach {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11}; ///    Output: [4 9 9 49 121]

        int i = 0;
        int j = arr.length-1;
        while(i <= j){
            if(i == j) {
                arr[i] *= arr[j]; /// so that both i and j don't square the same element
                i++;              /// PROBLEM when i and j point to same element so arr[i] *= arr[i] ,2 *= 2 = 4
                j--;               /// and arr[j] *= arr[j] = 4 *= 4 = 16 ...but technically answer should be 4
            }
            else{
                arr[i] *= arr[i];
                arr[j] *= arr[j];
                i++;
                j--;
            }

        }
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }

}
