package leetcodeDailyQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class VowelSpellChecker {
    public static void main(String[] args) {
        String[] wordlist = {"KiTe", "kite", "hare", "Hare"};
        String[] queries = {"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};

        String[] result = spellChecker(wordlist, queries);
        System.out.println(Arrays.toString(result));
    }

    /**
     * Vowel Spellchecker – Notes
     * <p>
     * 3 rules (priority order):
     * - Exact match → return as is.
     * - Case-insensitive match → use the first word in wordlist with same lowercase.
     * - Vowel-insensitive match → replace vowels with *, use the first word with same masked form.
     * <p>
     * If none → return "".
     * <p>
     * Steps to solve:
     * <p>
     * - Build 3 data structures from wordlist:
     * - Set → exact words
     * - Map<lowercase, word> → for case check
     * - Map<vowelMasked, word> → for vowel check
     * <p>
     * For each query:
     * <p>
     * - Check in exact set.
     * - Else check in lowercase map.
     * - Else check in vowel map.
     * <p>
     * Else return "".
     * <p>
     * Helper idea:
     * - maskVowels(word) → replace all a,e,i,o,u with *.
     * - Example: "kite" → "k*t*"
     * <p>
     * Complexity:
     * - Preprocess = O(N × L)
     * - Queries = O(Q × L)
     * (N = wordlist size, Q = queries size, L = word length ≤ 7)
     * <p>
     * 👉 One line summary:
     * Use Set for exact, Map for lowercase, Map for vowel-masked; check in order: exact → lowercase → vowel → none.
     */


    // helper function
    private static String maskVowel(String word) {
        StringBuilder sb = new StringBuilder();

        for (char ch : word.toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) {
                sb.append('*');
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }


    public static String[] spellChecker(String[] wordlist, String[] queries) {
        // data structure
        HashSet<String> exactWord = new HashSet<>();
        HashMap<String, String> caseMap = new HashMap<>();
        HashMap<String, String> vowelMap = new HashMap<>();

        // preprocess worldList
        for (String word : wordlist) {
            exactWord.add(word);

            String lower = word.toLowerCase();
            caseMap.putIfAbsent(lower, word);

            String masked = maskVowel(lower);
            vowelMap.putIfAbsent(masked, word);
        }

        // preprocess queries
        String[] result = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            if (exactWord.contains(q)) {
                result[i] = q;
            } else if (caseMap.containsKey(q.toLowerCase())) {
                result[i] = caseMap.get(q.toLowerCase());
            } else if (vowelMap.containsKey(maskVowel(q.toLowerCase()))) {
                result[i] = vowelMap.get((maskVowel(q.toLowerCase())));
            } else {
                result[i] = "";
            }
        }
        return result;
    }

}