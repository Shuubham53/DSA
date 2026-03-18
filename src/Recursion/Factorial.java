package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int ans =  calculateFactorial(n);
        System.out.println("Factorial: "+ans);

    }
    private static int calculateFactorial(int n){
        if(n == 1) return 1;
        return n * calculateFactorial(n-1);
    }
}
