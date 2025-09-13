package leetcodeDailyQuestion;

public class MaxFreqSumVC {
    public static int maxFreqSumVC(String s) {
        s = s.toLowerCase();

        if (s.matches(".*\\s.*")) {
            throw new IllegalArgumentException("space not allowed");
        }
        // store frequency of each letter
        int freq[] = new int[26];

        // count the frequency of letters
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                freq[ch - 'a']++;
            }
        }

        // find most frequent vowels
        int maxVowel = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char v : vowels) {
            maxVowel = Math.max(maxVowel, freq[v - 'a']);
        }

        // find most frequent consonant
        int maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            if ("aeiou".indexOf(ch) == -1) {
                maxConsonant = Math.max(maxConsonant, freq[i]);
            }
        }

        // return sum of both max
        return maxVowel + maxConsonant;
    }
}