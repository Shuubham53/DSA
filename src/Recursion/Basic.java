package Recursion;


public class Basic {
    ///  Printing from 1 to n : 1 2 3 4 5 .... 10
    public static void OneToN(int n){
        if(n == 0) return;

        OneToN(n-1);
        System.out.print(n+" ");

    }
    /// Printing from n to 1 : 10 9 8 7 6 5 .... 0
    public static void NtoOne(int n){
        if(n == 0) return;

        System.out.print(n+" ");
        NtoOne(n-1);

    }
    ///  Printing from 1 to n ,then n to 1 : 5 4 3 2 1 1 2 3 4 5
    public static void IncresingDecresing(int n){
        if(n == 0) return;

        System.out.print(n+" ");
        IncresingDecresing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        NtoOne(10);
        System.out.println();
        OneToN(10);
        System.out.println();
        IncresingDecresing(5);

    }
}
