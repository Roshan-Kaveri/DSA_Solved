package striver_80_roadmap.arrays.faq.medium;

import java.util.*;

public class threesum {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();

            int n = nums.length;

            Arrays.sort(nums);

            for (int i = 0; i < n; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue; // skip same element
                int j = i + 1;
                int k = n - 1;

                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum < 0) {
                        j++;
                    } else if (sum > 0) {
                        k--;
                    } else {
                        // Found a triplet that sums up to target
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        ans.add(temp);

                        // Skip duplicates
                        j++;
                        k--;
                        while (j < k && nums[j] == nums[j - 1]) j++;
                        while (j < k && nums[k] == nums[k + 1]) k--;
                    }
                }
            }
            return ans;
        }

}
