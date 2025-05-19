package striver_80_roadmap.arrays.faq.medium;

public class KadaneAlgorithm {
    class Solution {
        public int maxSubArray(int[] nums) {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for (int n : nums) {
                sum = sum + n;

                max = Math.max(sum, max);

                if (sum < 0) sum = 0;
            }
            return max; // dont compare sum and max; sum could be 0 and not exist in array
        }
    }

}
