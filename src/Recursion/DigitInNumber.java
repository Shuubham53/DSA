package Recursion;

import java.util.Scanner;

public class DigitInNumber {
    public static void main(String[] args) {


    int n ;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    int ans = digitCount(n);
    System.out.println("N square is : "+ans);
    }
    public static int digitCount(int n){
        if(n < 10){
            return 1;
        }

        return 1 + digitCount(n/10);

    }
}
