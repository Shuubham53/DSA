package TwoPointer.Array;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {2,0,0,-1,5,3,0,-5,}; // 2 -1 5 3 -5 0 0 0

        int n = arr.length;

        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
               if(i != j){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
                j++;
            }
        }


//        int idx = -1;
//        for (int i = 0; i < n; i++) {
//            if(arr[i] == 0){
//                idx = i;
//                break;
//            }
//        }
//
//        for (int i = idx+1; i <n ; i++) {
//            if(arr[i] != arr[idx]){
//                int temp = arr[i];
//                arr[i] = arr[idx];
//                arr[idx] = temp;
//                idx++;
//            }
//        }


        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
