package String;

public class ChangeString {

    // if the first letter is capital transform all string into uppercase
    // if the first letter is small transform all string into lowercase
    public static void main(String[] args) {
        String s = "abCD";
        int n = s.length();
        char first = s.charAt(0);
        String ans = null;
        if(Character.isLowerCase(first)){
           ans =  s.toLowerCase();
        }else{
            ans = s.toUpperCase();
        }

        System.out.println(ans);

    }
}
