package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class SortExceptOne {
    public static void main(String[] args) {
        int[] arr = {10, 4, 11, 7, 6, 20};// Output 4, 6, 11, 7, 10, 20
        int k = 2;
        int temp = arr[k];


        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int ele : arr){
            arrayList.add(ele);
        }
        arrayList.remove(k);
        Collections.sort(arrayList);
        arrayList.add(k,temp);
        for (int i = 0; i < arr.length ; i++) {
            if(i == k){
                arr[i] = temp;
            }
            arr[i] = arrayList.get(i);
        }

        for(int ele : arr){
            System.out.print(ele+ " ");
        }

    }
}
