package TwoPointer.Array;

///  SEGREGATE 0 IN LEFT AND 1 IN RIGHT
public class Segregate0And1 {
    public static void main(String[] args) {
        int[] arr = {1 ,1 ,1,1}; // Output :  0 0 0 1 1 1 1

        int i = 0;
        int j = arr.length-1;
        while(i < j){
            if (arr[i] == 0) {         /// if left side already has 0, it's correct
                i++;                   /// move left pointer forward
            }
            else if (arr[i] != 0 && arr[j] != 1) {
                                        /// left has 1, right has 0 → wrong positions
                int temp = arr[i];      /// swap them
                arr[i] = arr[j];
                arr[j] = temp;
                i++;                    /// move both pointers
                j--;
            }
            else {                      /// case when arr[i] == 1 but arr[j] == 1
                j--;                    /// move right pointer left
            }

        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
