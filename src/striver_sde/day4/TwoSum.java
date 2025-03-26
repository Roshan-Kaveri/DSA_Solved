package striver_sde.day4;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap();
        int[] ans = new int[2];

        for(int i = 0 ; i <  nums.length ; i++){
            if(hmap.containsKey(target-nums[i])){
                ans[0] = Math.min(i , hmap.get(target-nums[i]));
                ans[1] = Math.max(i , hmap.get(target-nums[i]));
                return ans;
            }else{
                hmap.put(nums[i], i);
            }
        }
        return ans;
    }

}
