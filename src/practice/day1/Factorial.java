package practice.day1;

public class Factorial {
    public static long iterativeFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static long recursiveFactorial(int n) {
        if (n <= 1) return 1;
        long result = n * recursiveFactorial(n-1);
        return result;
    }
}