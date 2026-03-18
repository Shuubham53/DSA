package BinarySearch.BinarySearch_On_Answer;

import java.util.Arrays;

public class MakeBouquets {
    public static void main(String[] args) {
        int[] arr = {1,10,3,10,2}; //   Output: 3
        int m = 3, k = 2;
        int n = arr.length;
        int ans = MinDays(arr,m,k,n);
        System.out.println("Minimum days Required : "+ans);


    }

    private static int MinDays(int[] arr, int m, int k, int n) {
        int low = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        int high = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);

        if((long)m*k > n) return -1; /// if bouquets is greater then flower
        while(low <= high){
            int mid = low + (high-low)/2;
            int days = CalculateMinDays(arr,k,mid);
            if(days >= m){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    private static int CalculateMinDays(int[] arr, int k, int mid) {
        int bouquets = 0;
        int count = 0;

        for(int ele : arr){
            if(ele <= mid ){
               count++;
            }else{
                bouquets += count/k;
                count = 0;
            }
        }
        bouquets += count/k;

        return bouquets;
    }
}
