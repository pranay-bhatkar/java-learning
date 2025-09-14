package practice.day2;

public class CountVowelsAndConsonants {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && !isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "Prana";

        System.out.println(countVowels(str));
        System.out.println(countConsonants(str));

        System.out.println(countVowels(str) + countConsonants(str));
    }
}