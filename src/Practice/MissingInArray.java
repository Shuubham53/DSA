package Practice;

import java.util.Arrays;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1};
        int n = arr.length+1;
        int totalSum =  n*(n+1)/2;
        int arrSum = 0;

       for(int i = 0; i<n-1; i++){
           arrSum += arr[i];
       }
        System.out.println("Missing number is : "+(totalSum-arrSum));


//    Input: arr[] = [1, 2, 3, 5]
//    Output: 4
    }
}
