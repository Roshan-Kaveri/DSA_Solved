package gfg_160.arrays.easy;

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/maximum-product-subarray3604

import java.io.*;
        import java.util.*;

public class MaxProductSubArray {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution_MPSA().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution_MPSA {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int p = 0, s = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(p == 0) p =1;
            if(s== 0 ) s= 1;

            p*=arr[i];
            s*=arr[arr.length-i-1];

            max = Math.max(max,Math.max(s,p));

        }
        return max;
    }
}

