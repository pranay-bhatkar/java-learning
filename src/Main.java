import practice.day2.StringMoreThanFive;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Hello Java ====");

        Scanner sc = new Scanner(System.in);

//        ReverseString.twoPointerMethod();
//        System.out.println(ReverseString.recursiveMethod("pray"));
//
//
//        System.out.println(IsPrimeNumber.isPrimeNumber(4, 2));
//
//        System.out.println(Factorial.iterativeFactorial(4));
//        System.out.println(Factorial.recursiveFactorial(5));
//
//        System.out.println(FibonacciSeries.recursiveFibonacci(3));
//
//        int n = 5;
//        int[] series = FibonacciSeries.iterativeFibonacci(5);
//
//        System.out.print("Fibonacci series up to n = " + n + ": ");
//        for (int num : series) {
//            System.out.print(num + " ");
//        }
//
//        Day 2
//
//        System.out.println("Enter the string :");
//        String str = sc.next();
//
//        int vowels = CountVowelsAndConsonants.countVowels(str);
//        int consonants = CountVowelsAndConsonants.countConsonants(str);
//
//        System.out.println("Vowels : " + vowels + "\n" + "consonants : " + consonants);
//
//        int[] arr = {8, 3, 6, 9, 4, 2, 4, 10};
//        LargestAndSmallestElement.findLargestAndSmallestElement(arr);
//
//
//        System.out.println("Enter the string :");
//
//        String str = sc.next();
//        if (IsPalindrome.isPalindrome(str)) {
//            System.out.println(str + " is palindrome");
//        } else {
//            System.out.println(str + " not a palindrome");
//        }

        List<String> inputList = List.of("pranay", "rahul", "ram", "rakesh");

        List<String> filtered = (StringMoreThanFive.filterStrings(inputList));

        for (String s : filtered) {
            System.out.println(s);
        }
    }
}