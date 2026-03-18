package BinarySearch;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {-1,3,4}; // Output : 8
        int n = arr.length;

        int low = 1;
        int high = n-2;

        if(n == 1) System.out.println(arr[0]);
        if(arr[0] > arr[n-1]) System.out.println(arr[0]);

        if(arr[n-2] < arr[n-1]) System.out.println(arr[n-1]);

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                System.out.println("Peak element is: "+arr[mid]);
                break;
            } else if (arr[mid-1] < arr[mid] &&  arr[mid] < arr[mid+1]) {
                low = mid + 1;
            }
            else high = mid - 1;
        }

    }
}
