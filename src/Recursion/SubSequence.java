package Recursion;
import java.util.ArrayList;
public class SubSequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        findSenSequence(arr,list,idx);
    }

    private static void findSenSequence(int[] arr, ArrayList<Integer> list, int idx) {
        int n = arr.length;
        if (idx == n) {
          for(int ele: list){
              System.out.print(ele+" ");
          }
          if(list.size() == 0){
              System.out.print("{}");
          }
          System.out.println();
          return;
        }
        findSenSequence(arr,list,idx+1);
        list.add(arr[idx]);
        findSenSequence(arr,list,idx+1);
        list.remove(list.size()-1);
    }
}
