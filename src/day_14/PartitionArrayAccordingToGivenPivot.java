package src.day_14;

import java.util.Arrays;

public class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int j = 0;

        for (int num : nums) {
            if (num < pivot) {
                res[j++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                res[j++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                res[j++] = num;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(new PartitionArrayAccordingToGivenPivot().pivotArray(nums, 10)));
    }
}
