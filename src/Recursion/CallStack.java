package Recursion;

public class CallStack {
    public static void main(String[] args) {
        fun1();
    }
    static void fun1(){
        int x = 1 ;
        fun2();
        System.out.print(x+" ");
    }
    static void fun2(){
        int x = 2;
        fun3();
        System.out.print(x+" ");
    }
    static void fun3(){
        int x = 3;
        System.out.print(x+" ");
    }
}
