package TwoPointer.Array;

import java.util.Arrays;

///  Assign cookies to the children as many possible if the size of the cookie is less then greed
/// move to the next cookies cause this cookie cannot fulfil children satisfaction
/// since array is sorted the next cookie will be greater than previous cookie which may be fulfilled
public class AssignCookies {
    public static void main(String[] args) {
//        Children greed: [1, 2, 3]
//        Cookie sizes: [1, 1]
//        Output : 1 (only 1 child can satisfy because there are 2 cookies of size 1....
//        but other child have greed of 2 and 3 so there is no cookie of size 2 and 3
//        so only 1 child can fulfil his satisfaction)
        int[] greed = {10,9,8,7};
        int[] size = {5,6,7,8};
        Arrays.sort(greed);
        Arrays.sort(size);
        int count = 0;
        int i = 0;
        int j = 0;
        while(i < greed.length && j < size.length){
            if(size[++j] >= greed[++i]){
                count++;
            }else{
                j++;
            }
        }
        System.out.println("Total Children satisfy: "+count);
    }
}
