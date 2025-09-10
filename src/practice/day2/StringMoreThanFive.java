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
}