package Recursion;

import java.util.Scanner;

public class SquareOfN {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();

         int ans = square(n);
        System.out.println("N square is : "+ans);
    }
    public static int square(int n){
        if(n == 1){
            return 1;
        }
        return (int)Math.pow(n,2) + square(n-1);
    }
}
