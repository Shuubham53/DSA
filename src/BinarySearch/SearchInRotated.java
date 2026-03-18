package BinarySearch;

///  Array will be given in sorted rotated array,Search element in this
public class SearchInRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = -3;
        int n = arr.length;

        int ans = SearchElement(arr,target,n);
        System.out.println("Element found at index : "+ans);
    }

    public static int SearchElement(int[] arr,int target,int n){
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target) return arr[mid];
            // In the Case When there is duplicate element are the in array
            if(arr[low] == arr[mid] && arr[high] == arr[mid]){
                low++;
                high--;
                continue;
            }
            /// Checking which part is sorted
            if(arr[low] <= arr[mid] ){ ///  Left Part is sorted
                ///checking whether element lies or not in sorted part
                if(arr[low] <= target && arr[mid] >= target){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{ /// Right part is Sorted
                 /// Checking whether element lies in unsorted part or not
                if(arr[mid] <= target && arr[high] >= target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
