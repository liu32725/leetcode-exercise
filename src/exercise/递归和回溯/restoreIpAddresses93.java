package exercise.递归和回溯;

import java.util.ArrayList;
import java.util.List;

public class restoreIpAddresses93 {
    private List<String> result = new ArrayList<>();
    private String orgStr;
    public List<String> restoreIpAddresses(String s) {
        String[] tempRes = new String[4];
        orgStr = s;
        find(s, 0, tempRes);
        return result;
    }

    private void find(String s, int index, String[] tempRes) {
        if(index == 4) {
            for(int i = 0; i < 4; i++) {
                String seg = tempRes[i];
                if ((seg.startsWith("0") && seg.length() > 1) || Integer.parseInt(seg) > 255) {
                    return;
                }
            }

            if (orgStr.equals(tempRes[0] + tempRes[1] + tempRes[2] + tempRes[3])) {
                result.add(tempRes[0] + "." + tempRes[1] + "." + tempRes[2] + "." + tempRes[3]);
            }
            return;
        }

        String str = s;
        for(int i = 1; i <= str.length() && i <= 3; i++) {
            tempRes[index] = str.substring(0, i);
            find(str.substring(i, str.length()), index + 1, tempRes);
        }
    }
}
