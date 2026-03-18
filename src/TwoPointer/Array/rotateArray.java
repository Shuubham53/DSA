package TwoPointer.Array;

public class rotateArray {
    public static void swap(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; // Output : 3 4 5 1 2
        int k = 2;

        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);
        swap(arr,0,arr.length-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
