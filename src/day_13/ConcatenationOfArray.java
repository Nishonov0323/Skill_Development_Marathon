package src.day_13;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i ++) {
            ans[i] = ans[i + nums.length] = nums[i];
        }
        System.gc();
        return ans;
    }
}
