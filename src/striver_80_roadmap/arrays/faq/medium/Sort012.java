package striver_80_roadmap.arrays.faq.medium;

public class Sort012 {
        public void sortZeroOneTwo(int[] nums) {

            int n = nums.length;
            int l = 0;
            int r = n - 1;
            int m = 0;
            // mid as main point
            while (m <= r) { // its equal to r
                if (nums[m] == 0) { // swap m and low
                    int t = nums[m];
                    nums[m] = nums[l];
                    nums[l] = t;
                    l++;
                    m++;
                } else if (nums[m] == 1) {

                    m++;
                } else if (nums[m] == 2) { // swap mid and high
                    int t = nums[r];
                    nums[r] = nums[m];
                    nums[m] = t;
                    r--;
                }
            }
    }

}
