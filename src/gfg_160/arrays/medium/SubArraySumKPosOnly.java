package gfg_160.arrays.medium;

import java.util.ArrayList;

public class SubArraySumKPosOnly {
    //  return with 1 based indexing ( start and end index )
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n){
            if(sum == target){
                ans.add(i+1);
                ans.add(j);
                return ans;
            }
            else if(sum < target && j<n){
                sum += arr[j];
                j++;
            }
            else{
                sum -= arr[i];
                i++;
            }
        }
        ans.add(-1);
        return ans;
    }
}
