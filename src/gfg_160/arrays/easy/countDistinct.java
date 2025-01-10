package gfg_160.arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;

public class countDistinct {
    ArrayList<Integer> countDistinct(int arr[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {

            map.put(arr[windowEnd], map.getOrDefault(arr[windowEnd], 0) + 1);

            if (windowEnd - windowStart + 1 >= k) {

                ans.add(map.size());

                if (map.get(arr[windowStart]) == 1) {
                    map.remove(arr[windowStart]);
                } else {
                    map.put(arr[windowStart], map.get(arr[windowStart]) - 1);
                }
                windowStart++;
            }
        }

        return ans;
    }
}