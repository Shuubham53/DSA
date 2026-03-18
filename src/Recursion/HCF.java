package Recursion;

public class HCF {
    public static void main(String[] args) {
        int n =  12;
        int m = 16;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0 && m % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
