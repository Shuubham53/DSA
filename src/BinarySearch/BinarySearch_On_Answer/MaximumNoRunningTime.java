package BinarySearch.BinarySearch_On_Answer;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Math.min;
// maximum running time for n computer
public class MaximumNoRunningTime {
    public static boolean calculateTime(int[] batteries, int computer,int time){
      int totalTime = 0;
      for(int arr : batteries){
          totalTime += min(arr,time);
      }

      if(totalTime >= computer*time) return true;
      return false;

    }
    public static void main(String[] args) {
       int computer = 3;
        int[] batteries = {10,10,3,5};
        // Output: 4

        int low = 0;
        int high = Arrays.stream(batteries).sum()/computer;
        System.out.println(high);



        while (low <= high) {
            int mid = low+(high-low)/2;
            boolean time = calculateTime(batteries,computer,mid);
            if(time == true ){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        System.out.println("total time for each computer : "+high);

    }
}
