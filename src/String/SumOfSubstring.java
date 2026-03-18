package String;

public class SumOfSubstring {
    public static void main(String[] args) {
        String str = "6759";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length() ; j++) {
                sum += Integer.parseInt(str.substring(i,j+1));
            }

        }
        System.out.println(sum);

    }
}
