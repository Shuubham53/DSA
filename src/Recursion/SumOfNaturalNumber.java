package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {
   public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum = calculateSum(n);

       System.out.println("Sum of N natural Number is :"+sum);
   }
   public static int calculateSum(int n){
       if(n==1) return 1;
       return n + calculateSum(n-1);
   }
}
