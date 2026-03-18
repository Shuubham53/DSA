package Practice;

public class nthStair {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        // 0 1 1 2 3 5 8 13


        for(int i = 1 ; i<10; i++){
            sum = a + b;
            a = b;
            b = sum;

        }
        System.out.println(sum);
    }
}
