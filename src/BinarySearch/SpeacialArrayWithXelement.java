package BinarySearch;

public class SpeacialArrayWithXelement {
    public static void main(String[] args) {
        int[] arr = {3,6,7,7,0};
        int low = 0;
        int high = arr.length;

        while (low <= high){
            int mid = low + (high-low)/2;
            if(isSpecial(arr,mid) == mid) {
                System.out.println(mid);
                break;
            } else if (isSpecial(arr,mid) > mid) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(-1);

    }

    private static int isSpecial(int[] arr, int mid) {
        int count = 0;
        for(int ele : arr){
            if(ele >= mid) count++;
        }
        return count;
    }
}
