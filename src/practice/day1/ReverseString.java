package practice.day1;

import java.util.Scanner;

public class ReverseString {
    // two pointer method
    public static  void twoPointerMethod(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        if(str.length() == 0) {
            System.out.println("Empty string");
            return;
        }

        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while(left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

                    left++;
                    right--;
        }

        String reversed = new String(chars);
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }

    // recursive method
    public static String recursiveMethod(String str){
        if(str == null || str.isEmpty()){
            return str;
        }

         return recursiveMethod(str.substring(1)) + str.charAt(0);

    }
}