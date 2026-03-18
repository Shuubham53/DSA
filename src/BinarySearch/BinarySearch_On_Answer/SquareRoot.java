package BinarySearch.BinarySearch_On_Answer;

public class SquareRoot {
    public static void main(String[] args) {
        long n = 2147395599;

        long low = 1;
        long high = n;

        while(low <= high){
            long mid = (low+high)/2;
            if(mid*mid > n){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        System.out.println("Square root is: "+high);
    }
}
