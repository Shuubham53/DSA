package TwoPointer.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/// Merge Sorted Array Without Sorting
/// Previously first we merge both the array then we sorted for answer
public class MergeSortedArray2 {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(2, 5, 6, 9);       // first sorted list
        List<Integer> arr2 = Arrays.asList(1, 3, 4, 7, 8);    // second sorted list
        List<Integer> ans  = new ArrayList<>();               // result list

        int i = 0;                                            // pointer for arr1
        int j = 0;                                            // pointer for arr2

        while (i < arr1.size() && j < arr2.size()) {          // run until one list ends

            if (arr1.get(i) < arr2.get(j)) {                  // compare current elements
                ans.add(arr1.get(i));                         // add smaller element
                i++;                                          // move pointer of arr1
            } else {
                ans.add(arr2.get(j));                         // add element from arr2
                j++;                                          // move pointer of arr2
            }
        }

        while (i < arr1.size()) {                              // add remaining elements of arr1
            ans.add(arr1.get(i));                              // because arr2 is finished
            i++;
        }

        while (j < arr2.size()) {                              // add remaining elements of arr2
            ans.add(arr2.get(j));                              // because arr1 is finished
            j++;                                               // BUG FIX → missing increment
        }

        System.out.println(ans);

    }
}
