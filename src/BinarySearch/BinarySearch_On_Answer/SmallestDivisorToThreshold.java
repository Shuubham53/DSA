package BinarySearch.BinarySearch_On_Answer;

import java.util.Arrays;

public class SmallestDivisorToThreshold {
    public static void main(String[] args) {
        int[] arr = {1, 2,5,9};
        int n = arr.length;
        int t = 6;
        int ans = SmallestDivisor(arr,n,t);
        System.out.println("Smallest Divisor: "+ans);
    }

    private static int SmallestDivisor(int[] arr, int n, int t) {
        int low = 1;
        int high = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);


        while (low <= high){
            int mid = low + (high-low)/2;
            int divisor = CalculateDivisor(arr,mid);
            if(divisor <= t){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    private static int CalculateDivisor(int[] arr, int mid) {
        int divisor = 0;
        for (int i = 0; i < arr.length; i++) {
            divisor += (int) Math.ceil((double)arr[i] /mid);
            // converting to double is must have required
            //  because arr[i] / mid, produces int value
            // so for getting ceil first we need to convert into double
            // then for storing in Ans we again convert into int

        }
        return divisor;
    }
}
