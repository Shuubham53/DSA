package Recursion;


public class PowerOfNumber {
    public static void main(String[] args) {
        int n =  2;  // 3 * 10 + 2 * 10 + 1    321  3
        int temp = n;
        int ans = 0;
        while(n != 0){
            int last = n % 10;
            ans = ans * 10 + last ;
            n /= 10;
        }
        int result = pow(temp,ans);
        System.out.println(result);
    }
    public static int pow(int a ,int b){
        if(b == 1 ) return a;

        int call = pow(a,b/2);
        if(b % 2 == 0) return call * call;
        else return a * call * call;
    }
}
