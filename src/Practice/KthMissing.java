package Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class KthMissing
{
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        for(int i = 0; i<k; i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j = i; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        System.out.println(arr[k-1]);
    }

}
