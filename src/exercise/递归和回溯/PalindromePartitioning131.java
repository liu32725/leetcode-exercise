package exercise.递归和回溯;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning131 {
    private List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        partition(s, 0, new ArrayList<>());
        return result;
    }

    private void partition(String s, int index, List<String> list) {
        if (index == s.length()) {
            for(String seg : list) {
                if(!isPalindrome(seg)) {
                    return;
                }
            }
            result.add(new ArrayList<>(list));
        }
        for(int i = index; i < s.length(); i++) {
            list.add(s.substring(index, i+1));
            partition(s, i + 1, list);
            list.remove(list.size() - 1);
        }
    }

    private boolean isPalindrome(String str) {
        if(str.length() == 1) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while(left <= right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
