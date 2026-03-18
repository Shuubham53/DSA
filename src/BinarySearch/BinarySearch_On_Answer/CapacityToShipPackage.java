package BinarySearch.BinarySearch_On_Answer;

public class CapacityToShipPackage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};  // Example: Minimum capacity = 15
        int days = 5;
        int n = arr.length;

        int ans = shipWithDays(arr,days,n);
        System.out.println("Minimum Capacity required : " + ans);
    }

    // Function to find the minimum ship capacity to ship all packages in 'days' days
    private static int shipWithDays(int[] arr, int days, int n) {

        // Search space:
        // low  = minimum possible capacity  (at least max element, but you used 0 for demo)
        // high = maximum possible capacity (sum of all elements)
        int low = 0;
        int high = n * (n + 1) / 2;  // sum of first n natural numbers, here arr is 1..n only

        // Binary search to find minimum valid capacity
        while (low <= high) {
            int mid = low + (high - low) / 2; // Our guessed capacity

            int daysRequired = calculateCapacity(arr, mid); // Check how many days needed

            // If guessed capacity requires too many days → increase capacity
            if (daysRequired > days) {
                low = mid + 1;
            }
            // If daysRequired <= days → this capacity works → try smaller
            else {
                high = mid - 1;
            }
        }
        return low;  // low will land on the minimum valid capacity
    }

    // Function to compute days required if ship capacity = mid
    private static int calculateCapacity(int[] arr, int mid) {

        int currentLoad = 0; // Weight loaded on current day
        int days = 1;        // Start from day 1

        for (int ele : arr) {

            // If current package fits in today's load → add it
            if (currentLoad + ele <= mid) {
                currentLoad += ele;
            }
            // Otherwise → need a new day
            else {
                days++;          // Increase day count
                currentLoad = ele;   // Load current element on the new day
            }
        }
        return days;  // Return total days required for this capacity
    }
}
