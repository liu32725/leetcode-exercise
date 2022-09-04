package exercise.动态规划;

import java.util.ArrayList;
import java.util.List;

public class DecodeWays91 {

    public static void main(String[] args) {
        numDecodings("12");
    }
    private static List<String> result = new ArrayList<>();
    public static int numDecodings(String s) {
        decodeNum(s, 0, "");
        System.out.println(result);
        return result.size();
    }

    private static void decodeNum(String s, int index, String r) {
        if(index == s.length() && s.equals(r)) {
            result.add(r);
            return;
        }

        for(int i = index; i < s.length(); i++) {
            if(i + 1 < s.length()) {
                if (s.charAt(i+1) == '0') {
                    decodeNum(s, i + 2, r + s.charAt(i) + s.charAt(i+1));
                } else {
                    decodeNum(s, i + 1, r + s.charAt(i));
                    decodeNum(s, i + 2, r + s.charAt(i) + s.charAt(i+1));
                }
            } else {
                decodeNum(s, i + 1, r + s.charAt(i));
            }
        }
    }
}
