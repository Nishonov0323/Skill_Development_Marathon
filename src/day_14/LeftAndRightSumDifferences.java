package src.day_14;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 0;
        right[nums.length - 1] = 0;

        for (int i = 1; i < nums.length; i ++) {
            left[i] = left[i - 1] + nums[i - 1];
            right[nums.length - 1 - i] = right[nums.length - i] + nums[nums.length - i];
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i ++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(new LeftAndRightSumDifferences().leftRightDifference(nums)));
    }
}
