package Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr,0);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void reverse(int[] arr,int left){
        int n = arr.length;
        if(left > n/2) return;
        int temp = arr[left];
        arr[left] = arr[n-left-1];
        arr[n-left-1] = temp;
        reverse(arr,left+1);
    }

}
