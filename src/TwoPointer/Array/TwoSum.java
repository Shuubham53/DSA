package TwoPointer.Array;

import java.util.ArrayList;
import java.util.Arrays;

/// TWO SUM
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,-2,3,5};
        int target = 0;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();

        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                pairs.add(pair);

                i++;
                j--;
            } else if (sum > target) {
                j--;
            }else{
                i++;
            }
        }

        System.out.println(pairs);







    }
}