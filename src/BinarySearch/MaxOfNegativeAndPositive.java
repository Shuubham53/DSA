package BinarySearch;


///  Max count of positive integer and negative integer
public class MaxOfNegativeAndPositive {
    public static void main(String[] args) {
        int[] arr = {3,-2,-1,0,0,1,2};
        int n = arr.length;
        // Negative count 4 (-6,-3,-2,-2)
        // Positive count 3  (7,8,9);
        // Zero is Neither positive nor negative
        //  Max of -ve and +ve (4,3) = 4.....ANS = 4

        System.out.println("Maximum Count: "+Math.max(CountNegative(arr,n),CountPositive(arr,n)));
        System.out.println(CountNegative(arr,n));
        System.out.println(CountPositive(arr,n));

    }

    public static int CountNegative(int[] arr,int n){
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= 0){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return high+1;
    }
    public static int CountPositive(int[] arr,int n){
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= 0){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return (n-high)-1;
    }


}
