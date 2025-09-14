package practice.day4;


public class SortArray {
    public static int[] sortArrayAscending(int[] num) {
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }

    public static int[] sortArrayDescending(int[] num) {
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }

    public static void main(String args[]) {
        int num[] = {5, 9, 2, 4, 3, 1};

        int asc[] = sortArrayAscending(num);

        for (int a : asc) {
            System.out.print(a + " ");
        }
        System.out.println();


        int desc[] = sortArrayDescending(num);

        for (int d : desc) {
            System.out.print(d + " ");
        }
    }
}