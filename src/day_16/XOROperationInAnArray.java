package src.day_16;

public class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];

        for (int i = 0; i < n; i ++) {
            nums[i] = start + 2 * i;
        }

        int result = 0;

        for (int i = 0; i < n; i ++) {
            result ^= nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new XOROperationInAnArray().xorOperation(5, 0));
    }
}
