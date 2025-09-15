package practice.day1;

public class FibonacciSeries {
    public static int recursiveFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static int[] iterativeFibonacci(int n) {
        if (n <= 0) return new int[0]; // empty array

        int[] series = new int[n + 1]; // 0 to n

        series[0] = 0;

        series[1] = 1;

        for (int i = 2; i <= n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        return series;
    }


//    int n = 5;
//    int[] series = FibonacciSeries.iterativeFibonacci(5);
//
//
//        System.out.print("Fibonacci series up to n = " + n + ": ");
//        for (int num : series) {
//        System.out.print(num + " ");
//    }


    public static void main(String[] args) {
        int n = 10;
        int[] series = iterativeFibonacci(n);

        for (int num : series) {
            System.out.print(num + " ");
        }
    }
}