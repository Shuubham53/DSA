package BinarySearch.BinarySearch_On_Answer;

public class NthRoot {
    public static void main(String[] args) {
        int n = 2;
        int m = 9;

        int ans = root(n,m);
        System.out.println("Nth root is: "+ans);
    }
    public static int root(int n,int m){
        int low = 1;
        int high = m;

        while(low <= high){
            int mid = low + (high-low)/2;
            int midN = calculateRoot(n,mid);
            if(midN== m) return mid;
            else if(mid*mid*mid > m){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    private static int calculateRoot(int n, int mid) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= mid;
        }
        return ans;
    }
}
