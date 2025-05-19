package striver_80_roadmap.arrays.faq.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class foursum {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans = new ArrayList<>();

            int n = nums.length;

            Arrays.sort(nums);
            for(int r = 0 ; r < n ; r++){
                if(r > 0 && nums[r]== nums[r-1]) continue;

                for (int i = r + 1; i < n; i++) {
                    if (i > r + 1 && nums[i] == nums[i - 1]) continue; // skip same element
                    int j = i + 1;
                    int k = n - 1;

                    while (j < k) {
                        int sum = nums[i] + nums[r] + nums[j] + nums[k];

                        if (sum < target) {
                            j++;
                        } else if (sum > target) {
                            k--;
                        } else {
                            // Found a triplet that sums up to target
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[r]);
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
            }
            return ans;
        }
    }


