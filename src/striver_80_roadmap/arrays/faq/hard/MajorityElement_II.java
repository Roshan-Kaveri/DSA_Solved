package striver_80_roadmap.arrays.faq.hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_II {
        public List<Integer> majorityElementTwo(int[] nums) {
            int count = 0,  count2 = 0 ;
            int var = Integer.MIN_VALUE, var2 = Integer.MIN_VALUE;
            List<Integer> list = new ArrayList<>();

            for(int i = 0 ; i < nums.length ; i++){
                if( count == 0 && var2 != nums[i]) {
                    var = nums[i];
                    count++;
                }
                else if( count2 == 0 && var != nums[i]){
                    var2 = nums[i];
                    count2++;
                }

                else if(nums[i] == var){
                    count++;
                }
                else if(nums[i] == var2){
                    count2++;
                }
                else{
                    count--;
                    count2--;
                }
            }

            // check if they appear more than 3 times
            count = 0; count2 = 0;

            for (int i = 0; i < nums.length ; i++) {
                if (nums[i] == var) {
                    // Count occurrences of el1
                    count++;
                }
                if (nums[i] == var2) {
                    // Count occurrences of el2
                    count2++;
                }
            }
            int mini = nums.length / 3 + 1;
            if (count >= mini) {
                list.add(var);
            }
            if (count2 >= mini && var != var2) {
                list.add(var2);
            }
            return list;
        }

}
