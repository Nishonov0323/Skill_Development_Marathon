package src.day_13;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {

    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {
                if (boxes.charAt(j) == '1') {
                    ans[i] += Math.abs(j - i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String box = "110";

        System.out.println(Arrays.toString(new MinimumNumberOfOperationsToMoveAllBallsToEachBox().minOperations(box)));
    }
}
