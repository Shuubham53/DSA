package Practice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,3,6};
        int n = arr.length;

        /// Sorting in Ascending
        for(int i = 0; i<n; i++){
            boolean isSwapped = true;
            for(int j = 1; j<n-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = false;
                }
            }
            if(isSwapped) break;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //sorting in descending
        for(int i = 0; i<n; i++){
            boolean isSwapped = true;
            for(int j = 1; j<n-i; j++){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = false;
                }
            }
            if(isSwapped) break;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

}
