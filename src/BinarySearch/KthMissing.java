package BinarySearch;

public class KthMissing {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11}; // Output : 9
        int n = arr.length;
        int k = 5;

        int ans = SearchElement(arr,n,k);
        System.out.println("Kth Missing element is : "+ans);
    }

    ///  2 3 4 7 11
    ///  0 1 2 3 4
    ///  ---------
    //   arr[mid] - (mid+1) ----> 2-1 3-2 4-3 7-4 11-5 ----> 1 1 1 3 6
    ///                                                      missing number til that mid
    /// we want 5th so after binary seach low goes to the element who is missing more than > k
    /// then return k+low ---> low point to 4 index and k is 5 --->5+4 = 9 .... 5th Missing element is 9
    public static int SearchElement(int[] arr,int n,int k){
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] - (mid+1) <= k){ // to check how many number are missing before mid
                low = mid + 1;           // let arr[mid] - (mid+1) come 3, but we want 5th missing
            }                            // so low = mid + 1
            else{
                high = mid - 1;
            }
        }
        return k+low;
    }
}
