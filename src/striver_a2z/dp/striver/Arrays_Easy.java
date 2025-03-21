package striver_a2z.dp.striver;

public class Arrays_Easy {
    class MoveZerosToEND {
        public void moveZeroes(int[] nums) {

            int j = -1;
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    j = i;
                    break;
                }
            }

            if (j == -1) return;

            for (int i = j + 1; i < n; i++) {

                if (nums[i] != 0) {
                    // swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }

            return;

        }
    }


}
