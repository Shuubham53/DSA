package Recursion;

public class Palindrome {
    public static void main(String[] args) {
         String str = "racecar";
         boolean ans =  check(str,0);
         if(ans) System.out.println("Palindrome");
         else System.out.println("Not Palindrome");
    }
    static boolean check(String  str,int left){
        int n = str.length();
        if(left >= n/2 ) return true;

        if(str.charAt(left)!= str.charAt(n-left-1) ) return false;
        return check(str,left+1);

    }
}
