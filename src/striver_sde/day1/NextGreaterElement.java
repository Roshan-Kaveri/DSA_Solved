package striver_sde.day1;

class NextGreaterElement {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i = n-2 ; i >= 0  ; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            //  rev(nums,0,n);
            rev(nums, 0);
            return;
        }



        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                int tmp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = tmp;
                break;

            }
        }

        rev(nums, idx + 1);


    }


    public void rev(int[] arr, int i) {
        int left = i, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }

}


