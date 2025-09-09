import practice.day1.Factorial;
import practice.day1.FibonacciSeries;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Hello Java ====");

//        ReverseString.twoPointerMethod();
//        System.out.println(ReverseString.recursiveMethod("pray"));


//        System.out.println(IsPrimeNumber.isPrimeNumber(4,2));

//        System.out.println(Factorial.iterativeFactorial(4));
//        System.out.println(Factorial.recursiveFactorial(5));

//        System.out.println(FibonacciSeries.recursiveFibonacci(3));

        int n = 5;
        int[] series = FibonacciSeries.iterativeFibonacci(5);

        System.out.print("Fibonacci series up to n = " + n + ": ");
        for (int num : series) {
            System.out.print(num + " ");
        }

    }
}