package exercise.递归和回溯;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch401 {

    public static void main(String[] args) {
        BinaryWatch401 binaryWatch401 = new BinaryWatch401();
        List<String> strings = binaryWatch401.readBinaryWatch(9);
        System.out.println(strings);
    }

    private int[] time = new int[]{1, 2, 4, 8, 1, 2, 4, 8, 16, 32};
    private List<List<Integer>> turnedOnArray = new ArrayList<>();
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        readBinaryWatch(turnedOn, 0, new ArrayList<>());
        for(List<Integer> list : turnedOnArray) {
            int hour = 0;
            int minute = 0;
            for(Integer value : list) {
                if (value <= 3) {
                    hour = hour + time[value];
                } else {
                    if (minute >= 60) {
                        hour = hour + 1;
                        minute = minute - 60;
                    }
                    minute = minute + time[value];
                }
            }
            if (minute >= 60) {
                hour = hour + 1;
                minute = minute - 60;
            }
            if (hour > 11) {
                continue;
            }
            if (minute < 10) {
                String str = hour + ":" + "0" + minute;
                result.add(str);
            } else {
                String str = hour + ":" + minute;
                result.add(str);
            }


        }
        return result;
    }

    private void readBinaryWatch(int turnedOn, int index, List<Integer> list) {
        if (turnedOn == 0) {
            turnedOnArray.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < 10; i++) {
            list.add(i);
            readBinaryWatch(turnedOn - 1, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
