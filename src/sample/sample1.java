package sample;

public class sample1 {

    public static boolean isTwiceNumberAppear(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i != j && num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int num[] = {1, 2, 3, 3, 4};
        boolean result = isTwiceNumberAppear(num);
        System.out.println(result);

    }
}