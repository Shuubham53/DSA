package Recursion;

public class PrintArray {
    public static void print(int[] arr,int n ){
        if(n == 0){
            System.out.print(arr[0]+" ");
            return;
        }
        print(arr,n-1);
        System.out.print(arr[n]+" ");
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        print(arr,arr.length-1);
    }
}
