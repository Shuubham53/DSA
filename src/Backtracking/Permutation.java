package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void helper(int[] arr ,int idx, List<List<Integer>> ans ){
        int n = arr.length;
        if(idx == n-1){
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<n;i++){
                list.add(arr[i]);
            }
            ans.add(list);
            return;
        }
        for (int i = idx; i < n; i++) {
            swap(i,idx,arr);
            helper(arr,idx+1,ans);
            swap(i,idx,arr);
        }
    }
    public static void swap(int i,int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr,0,ans);
        System.out.println(ans);
    }
}
