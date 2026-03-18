package Recursion;

public class aRaisedTob {
    public static void main(String[] args) {
        int a = 2, b = 4;

        int ans = calculate(a,b);
        System.out.println(ans);
    }

    private static int calculate(int a, int b) {
        if(b == 1) return a;
        int call  = calculate(a,b/2);
        if(b%2== 0){
            return call * call;
        }
        else return a * call * call;
    }

}
