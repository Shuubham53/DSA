package Recursion;

public class SumOfArray {
    public static int print(int[] arr,int n ){
        if(n == 0){
            return arr[0];
        }
        return  print(arr,n-1)+ arr[n];

    }
    public static void main(String[] args) {
        int[] arr = {6,12,1,2,1,2};
        int sum = print(arr,arr.length-1);
        System.out.println("sum is: "+sum);
    }
}
