package BinarySearch.BinarySearch_On_Answer;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] arr = {805306368,805306368,805306368}; // Output: 4--> because koko need speed of 4 to complete all piles
        int h = 1000000000;              // ... in given time which is 8
        int n = arr.length;

        int ans = minEatingSpeed(arr,h,n);

        System.out.println("The minimum speed is required to finish all banana is : "+ans);
    }

    private static int minEatingSpeed(int[] arr, int h, int n) {
        int low = 1;
        int high = IntStream.of(arr).max().getAsInt();

        while(low <= high){
            int mid = low + (high-low)/2;
            long timeReuired = totalHours(arr,mid);
            if(timeReuired > h){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static long totalHours(int[] arr, int speed) {
        long hours = 0;
        for (int p : arr) {
            hours += (p + speed - 1) / speed;   // Faster and safe ceil
        }
        return hours;
    }
}
