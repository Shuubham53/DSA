package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34 55....
        // 1 2 3 4 5 6 7 8  9  10 11

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt() ;
        System.out.println("Nth fibonacci number is: "+fibonacciSeries(n));

    }

    static int fibonacciSeries(int n){
        if(n == 0 || n == 1) return n;
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }
}
