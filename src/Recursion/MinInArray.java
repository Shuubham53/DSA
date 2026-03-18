package Recursion;

public class MinInArray {
    public static int print(int[] arr,int n ){
        if(n == 0){
            return arr[0];
        }
        int mini = Math.min(arr[n],print(arr,n-1));
        return mini;
    }
    public static void main(String[] args) {
        int[] arr = {6,12,21,22,5,10};
        int min = print(arr,arr.length-1);
        System.out.println("minimum is: "+min);
    }
}
