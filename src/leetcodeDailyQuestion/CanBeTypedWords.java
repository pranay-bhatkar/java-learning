package leetcodeDailyQuestion;

import java.util.HashSet;

class CanBeTypedWords {
    public static int canBeTypedWords(String text, String brokenLetters) {

        text = text.toLowerCase();
        brokenLetters = brokenLetters.toLowerCase();


        // step 1: put all the broken letters in the Set for lookup
        HashSet<Character> brokenSet = new HashSet<>();
        for (char ch : brokenLetters.toCharArray()) {
            brokenSet.add(ch);
        }

        // step 2: Split the text into words
        String[] words = text.split(" ");
        int count = 0;

        // step 3: check each word
        for (String word : words) {
            boolean canType = true;
            for (char ch : word.toCharArray()) {
                if (brokenSet.contains(ch)) {
                    canType = false;
                    break;
                }
            }
            if (canType) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "hello work";
        String brokenLetters = "ad";

        int result = canBeTypedWords(text, brokenLetters);
        System.out.println(result);
    }
}