package leetcodeDailyQuestion;

public class TwoSum {

    public static int[] twoSum(int[] num, int target) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if ((num[i] + num[j]) == target) {
                    System.out.println("sum found");
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


    public static void main(String args[]) {
        int num[] = {1, 4, 7};
        int target = 5;
        int[] result = twoSum(num, target);

        if (result.length > 0) {
            System.out.println("indices [ " + result[0] + "," + result[1] + " ]");
        }
    }
}