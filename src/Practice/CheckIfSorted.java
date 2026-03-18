package Practice;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,5,6,9};
        int n = arr.length;
        boolean flag = true;
        for(int i = 1; i<n; i++){
            if(arr[i-1] >  arr[i]) flag = false;
        }

        if(flag){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
    }
}
