package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] a = {3, 4, 2, 2, 4};
        int[] b = {3, 2, 2, 7};
//        Output: 2 2 3
        ArrayList<Integer> ans = new ArrayList<>();
        int m = a.length;
        int n = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] > b[j]) {
                j++;
            }else {
                i++;
            }

        }
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
