package practice.day4;

public class Calculator {
    public static int calculator(int a, int b, String choice) {

        switch (choice.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mult":
                return a * b;
            case "div":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation :" + choice);
        }
    }
}