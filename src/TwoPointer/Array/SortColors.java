package TwoPointer.Array;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int n = arr.length;
        int i = 0;
        int j = 0;
        int k = n-1;

        while(j <= k) {
            if (arr[j] == 0) {
                swap(arr,i,j);
                i++;
                j++;
            } else if (arr[j] == 1) {
                j++;
            }
            else{
                swap(arr,j,k);
                k--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
