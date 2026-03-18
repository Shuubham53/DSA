package String;

public class CountVowel {
    public static void main(String[] args) {
        String str = "Virat kohli is great player";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a') count++;
            if(str.charAt(i) == 'e') count++;
            if(str.charAt(i) == 'i') count++;
            if(str.charAt(i) == 'o') count++;
            if(str.charAt(i) == 'u') count++;
        }

        System.out.println("Total Vowel: "+count);
    }
}
