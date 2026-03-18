package String;

import java.util.Arrays;

///  anagram means the both string are same put the alphabet is jumbled
/// eg: "listen" -> "silent" if we rearrange silent it becomes "listen"
/// sort "listen" it becomes "eilnst"
/// sort "silent" is becomer "eilnst"
/// so both are equal of arranging means they ar anagram
public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean ans = isAnagram(arr1,arr2,s1,s2);
        if(ans){
            System.out.println("It is Anagram");
        }else{
            System.out.println("It is not Anagram");
        }
    }

    private static boolean isAnagram(char[] arr1, char[] arr2, String s1, String s2) {
        if(s1.length()!= s2.length()) return false;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
