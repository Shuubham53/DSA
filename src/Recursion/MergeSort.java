package Recursion;

import java.util.ArrayList;

public class MergeSort {
    public static void sort(int[] arr,int start,int end,int mid){
        int left = start;
        int right = mid+1;
        ArrayList<Integer> ans = new ArrayList<>();

        while(left <= mid && right <= end){
            if(arr[left] < arr[right]){
                ans.add(arr[left]);
                left++;
            }else{
                ans.add(arr[right]);
                right++;
            }
        }
        while( left <= mid){
            ans.add(arr[left]);
            left++;
        }
        while(right <= end){
            ans.add(arr[right]);
            right++;
        }
        int idx = 0;
        while(start <= end){
            arr[start] = ans.get(idx);
            idx++;
            start++;
        }


    }
    public static void mergeSort(int[] arr,int start,int end){
        if(start == end) return;
        int mid = start +(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        sort(arr,start,end,mid);
    }
    public static void main(String[] args) {
        int[] arr = {4,3,1,7,2,6,5,8,10,9};

        mergeSort(arr,0,arr.length-1);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
