package src.day_11;

import java.util.*;

public class ConvertAnArrayIntoA2DArrayWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            map.put(i, 1 + map.getOrDefault(i, 0));
            set.add(i);
        }

        List<List<Integer>> list = new ArrayList<>();
        while (!map.isEmpty()) {
            List<Integer> row = new ArrayList<>();

            for (int i : set) {
                if (map.containsKey(i)) {
                    int count = map.get(i);
                    row.add(i);
                    if (count == 1) {
                        map.remove(i);
                    } else {
                        map.put(i, --count);
                    }

                }
            }
            list.add(row);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,1,2,3,1};
        System.out.println(new ConvertAnArrayIntoA2DArrayWithConditions().findMatrix(arr));
    }
}
