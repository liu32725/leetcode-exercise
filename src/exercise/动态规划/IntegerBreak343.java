package exercise.动态规划;

public class IntegerBreak343 {
    private int[] arr;
    public int integerBreak(int n) {
        arr = new int[n+1];
        return breakInteger(n);
    }

    private int breakInteger(int n) {
        if(arr[n] != 0) {
            return arr[n];
        }
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int result = 0;
        for(int i = 1; i < n; i++) {
            result = Math.max(result, Math.max(i * (n - i), i * breakInteger(n - i)));
        }
        arr[n] = result;
        return result;
    }
}
