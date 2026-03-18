package BinarySearch;

public class SingleElementInSorted {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3}; // Output : 4

        int ans = BinarySearch(arr);
        System.out.println(ans);
    }
    public static int BinarySearch(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low < high){
            int mid = low+(high-low)/2;

            if(mid % 2 == 1){
                mid--;
            }
            if(arr[mid] == arr[mid+1]){
                low = mid + 2;
            }else {
                high = mid;
            }
        }
       return arr[low];
    }
}
