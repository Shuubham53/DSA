package BinarySearch;

public class SearchInDescending {
    public static void main(String[] args) {
        int[] arr = {9,7,4,2,-4,-6};
        int target = -6;
        int n = arr.length;
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
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}


