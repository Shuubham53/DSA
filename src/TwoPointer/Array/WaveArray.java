package TwoPointer.Array;

///  Wave array
///  Step 1: Sort the array
///  Step 2: Swap adjacent elements

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 14};
        int n = arr.length;

        int i = 0;                 // pointer for even index
        int j = 1;                 // pointer for odd index

        while (j < n) {            // run until second pointer is inside array

            int temp = arr[i];     // swap arr[i] and arr[j]
            arr[i] = arr[j];
            arr[j] = temp;

            i += 2;                // move to next even index
            j += 2;                // move to next odd index
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }

        //
    }
}
