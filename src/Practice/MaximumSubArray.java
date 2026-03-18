package Practice;

import static java.lang.Math.max;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {6,2,-30,4,8,9};
        int n = arr.length;

        // output : 21


        int maxProduct = 1;
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < n ; i++) {
            prefix *= arr[i];
            suffix *= arr[n-i-1];
            maxProduct = Math.max(maxProduct,max(prefix,suffix));
        }
        System.out.println("Max product is : "+maxProduct);

    }
}
