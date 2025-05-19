package striver_sde.day3;

public class Majority_Element {

    public int majorityElement(int[] nums) {

        if( nums.length == 1){
            return nums[0];
        }

        int ele = 0 , count =0;
        for(int i = 0 ; i < nums.length ; i++){
            if(count == 0){
                count++;
                ele = nums[i];
            }else if (ele == nums[i]){
                count++;
            }else{
                count--;
            }
        }

        int c1= 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == ele){
                c1++;
            }
        }

        if(c1 <= nums.length/2){
            return -1;
        }

        return ele;
    }

}
