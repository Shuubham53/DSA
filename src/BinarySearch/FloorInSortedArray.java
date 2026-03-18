package BinarySearch;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int n = arr.length;
        int target = 5;
        int ans = -1;

        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] <= target){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        System.out.println("Floor is : "+high);
    }
}
