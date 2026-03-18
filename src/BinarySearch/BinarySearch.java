package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,7,13,99,101};
        int n = arr.length;
        System.out.println("Enter the target: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ans = search(arr,n,target);
        if(ans != -1){
            System.out.println("Element Found at index: "+ans);
        }else {
            System.out.println("Element not Found in the array");
        }

    }
    public static int search(int[] arr,int n,int k){
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                return mid;
            } else if (arr[mid] > k) {
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
