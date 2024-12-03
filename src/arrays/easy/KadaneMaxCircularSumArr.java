package arrays.easy;

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/max-circular-subarray-sum-1587115620

import java.io.*;
        import java.util.*;

class KadaneMaxCircularSumArr {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution_KMCSA().circularSubarraySum(arr));
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution_KMCSA {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int sum = 0, minsum=Integer.MAX_VALUE, maxsum=Integer.MIN_VALUE;
        int asum = 0 , bsum = 0;
        for(int i = 0 ; i<arr.length ; i++){

            asum=Math.min(arr[i],asum+arr[i]);
            minsum = Math.min(minsum,asum);

            bsum=Math.max(arr[i],bsum+arr[i]);
            maxsum = Math.max(maxsum,bsum);

            sum+=arr[i];
        }
        int circularsum = sum - minsum;
        int normalsum = maxsum;

        if(minsum == sum)
            return normalsum;

        return Math.max(normalsum,circularsum);

    }

}
