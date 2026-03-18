package Practice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,6,4,3,0,3};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j = i; j<n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
