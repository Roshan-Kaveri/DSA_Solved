package gfg_160.arrays.easy;

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/kadanes-algorithm-1587115620

// Initial Template for Java
import java.io.*;
        import java.util.*;

class KadaneMaxSumSubArr {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution_KMSSA obj = new Solution_KMSSA();

            // calling maxSubarraySum() function
            System.out.println(obj.maxSubarraySum(arr));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution_KMSSA {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        if(arr.length< 1){
            return 0;
        }

        if(arr.length < 2){
            return arr[0];
        }
        // Your code here
        int sum = 0, msum=Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            if(sum < 0) sum = 0;
            sum+=arr[i];
            msum = Math.max(msum,sum);
        }


        return msum;


    }
}

