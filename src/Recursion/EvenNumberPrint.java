package Recursion;

public class EvenNumberPrint {
    public static void main(String[] args) {


        printEven(12);


    }
    public static void printEven(int n){
        if(n  == 2){
            System.out.print(n+" ");
            return;
        }
        printEven(n-2);
        System.out.print(n+" ");

    }
}
