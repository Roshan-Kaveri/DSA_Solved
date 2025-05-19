package striver_80_roadmap.arrays.faq.hard;

public class MajorityElement {
        public int majorityElement(int[] nums) {
            int count = 0;
            int var = nums[0];

            for (int i = 0; i < nums.length; i++) {
                if (count == 0) var = nums[i];
                if (nums[i] == var) {
                    count++;
                } else {
                    count--;
                }
            }
            return var;
        }

}
