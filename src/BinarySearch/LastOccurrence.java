package BinarySearch;

import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1 ,3, 5, 5, 5 ,5, 67, 123 ,125};
        int n = arr.length;
        System.out.print("Enter element: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int ans = Occurrence(arr,n,target);
        System.out.println("First Occurrence is: "+ans);
    }
    public static int Occurrence(int[] arr, int n, int target) {
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > target){
                high = mid - 1;
            }
            else{
               ans = mid;
               low = mid + 1;
            }
        }
        return ans;
    }
}
