package gfg_160.arrays.medium;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class MAX1AfterFlip {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[str.length];

            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());
            int ans = new Solution_M1AF().maxOnes(arr, m);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution_M1AF {
    // k is the maximum number of zeros allowed to flip
    public int maxOnes(int arr[], int k) {
        int res = 0;

        int start = 0, end = 0;

        int cnt = 0;

        while (end < arr.length) {
            if (arr[end] == 0)
                cnt++;

            while (cnt > k) {
                if (arr[start] == 0)
                    cnt--;

                start++;
            }

            res = Math.max(res, (end - start + 1));

            end++;
        }

        return res;
    }
}
