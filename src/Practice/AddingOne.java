package Practice;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr = {3,6,2,1}; /// Output 3 6 2 2

        for(int i = arr.length -1 ; i>=0; i--){
            if(arr[i] < 9){
                arr[i]++;
                break;
            } else if (arr[i] > 9) {
                arr[i]++;

            }
        }
    }
}
