package gfg_160.arrays.easy;

//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote

import java.io.*;
        import java.util.*;

public class Majority_Element_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution_ME ob = new Solution_ME();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution_ME {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int cnt1 = 0 , cnt2=0, ele1 = -1, ele2 = -1;

        for(int ele : nums){
            if(ele1 == ele)
                cnt1++;

            else if(ele2 == ele)
                cnt2++;

            else if (cnt1 == 0) {
                ele1 = ele;
                cnt1++;
            }


            else if (cnt2 == 0) {
                ele2 = ele;
                cnt2++;
            }

            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        cnt1 = 0; cnt2=0;

        for(int ele: nums){
            if(ele == ele1) cnt1++;
            if(ele2 == ele) cnt2++;
        }
        int n = nums.length;
        if(cnt1 > n/3 ){
            res.add(ele1);
        }
        if(cnt2 > n/3){
            res.add(ele2);
        }

        if (res.size() == 2 && res.get(0) > res.get(1)) {
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
        }


        return res;
    }
}
