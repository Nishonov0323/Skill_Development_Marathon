package src.day_12;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int[] i : accounts) {
            for (int j : i) {
                sum += j;
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
