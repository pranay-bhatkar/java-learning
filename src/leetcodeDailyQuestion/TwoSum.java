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
}