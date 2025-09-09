package practice.day1;

public class IsPrimeNumber {
    public static Boolean isPrimeNumber(int n, int i) {

        if (n <= 1){
            return false;
        } else if (n == 2) {
            return  true;
        } else if ( (i * i) > n) {
            return  true;
        } else if (n % i == 0) {
            return  false;
        }
        return isPrimeNumber(n, i+1);
    }
}