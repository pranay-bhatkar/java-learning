package practice.day2;

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        str.toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}