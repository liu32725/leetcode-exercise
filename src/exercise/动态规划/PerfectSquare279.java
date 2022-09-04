package exercise.动态规划;

public class PerfectSquare279 {
    private int[] arr;
    public int numSquares(int n) {
        arr = new int[n+1];
        return squaresNum(n);
    }

    private int squaresNum(int n) {
        if(arr[n] != 0) {
            return arr[n];
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int minLength = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            if(i * i > n) {
                break;
            }
            minLength = Math.min(minLength, 1+ squaresNum(n - i * i));
        }
        arr[n] = minLength;
        return minLength;
    }
}
