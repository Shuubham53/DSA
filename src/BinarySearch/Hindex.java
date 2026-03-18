package BinarySearch;

public class Hindex {
    public static boolean calculteMaximum(int[] arr,int h){
        int count = 0;
        for(int each: arr){
            if(each >= h){
                count++;
            }
        }
        if(count >= h) return true;
        return false;
    }
    public static void main(String[] args) {
//        Input: citations = [0,1,3,5,6]
//        Output: 3
        int[] arr = {1,2,100};

        int low = 0;
        int high = arr.length;

        while(low <= high){
            int mid = low + (high-low)/2;
            boolean ans = calculteMaximum(arr,mid);
            if(ans == true){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println(low-1);
    }
}
