package practice.day2;

import java.util.ArrayList;
import java.util.List;

public class StringMoreThanFive {

    public static List<String> filterStrings(List<String> inputList) {

        List<String> result = new ArrayList<>();

        for (String str : inputList) {
            if (str.length() > 5) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String arg[]) {
        List<String> inputList = List.of("pranay", "rahul", "ram", "rakesh", "rajesh", "rockey", "krishna");

        List<String> result = filterStrings(inputList);

        for (String a : result) {
            System.out.println(a);
        }
    }
}