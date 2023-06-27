package src.day_11;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> r = new ArrayList<>(candies.length);
        for (int i : candies) {
            if (max < i) {
                max = i;
            }
        }

        for (int candy : candies) {
            int maxCandies = candy + extraCandies;
            if (max <= maxCandies) {
                r.add(true);
            } else {
                r.add(false);
            }
        }
        return r;
    }
}
