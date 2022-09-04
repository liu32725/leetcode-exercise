package exercise.递归和回溯;

import java.util.ArrayList;
import java.util.List;

public class letterCombinationsOfAPhoneNumber17 {

    private static String[] array = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private static List<String> res = new ArrayList<>();

    public static void main(String[] args) {
        List<String> strings = letterCombinations("23");
        System.out.println(strings);
    }

    public static List<String> letterCombinations(String digits) {
        find(digits, 0, "");
        return res;
    }

    private static void find(String digits, int index, String tempRes) {
        if (index == digits.length()) {
            res.add(tempRes);
            return;
        }
        char c = digits.charAt(index);
        String str = array[c - '0' - 2];
        for(int i = 0; i < str.length(); i++) {

            find(digits, index+1, tempRes + str.charAt(i));
        }
    }
}
