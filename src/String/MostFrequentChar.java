package String;

import java.util.Arrays;

public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "shubham";

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int maxFreq = -1;
        char ans = str.charAt(0);

        int i = 0;
        int j = 0;
        while (j < arr.length){
            if(arr[i] == arr[j]) j++;
            else{
                int freq = j-i;
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j-i;
        if(freq > maxFreq){
            maxFreq = freq;
            ans = arr[i];
        }

        System.out.println(ans);
    }


}
