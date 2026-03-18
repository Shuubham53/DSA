package TwoPointer.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/// THREE SUM
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { 84 ,24, 14, 97, 93, 92 ,83};

        int target = 181;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            int j = i+1;
            int k = arr.length-1;
            while (j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
///                    pairs.add(List.of(arr[i],arr[j],arr[k]));   when List is given
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    pair.add(arr[k]);
                    pairs.add(pair);
                    j++;k--;
                } else if (sum > target) {
                    k--;
                }else{
                    j++;
                }
            }
        }

        System.out.println(pairs);
    }
}
