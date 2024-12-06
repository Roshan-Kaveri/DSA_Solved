package arrays.easy;

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Minimize_Heights {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);

            // Ensure input is read correctly
            inputLine = br.readLine().trim().split(" ");
            if (inputLine == null || inputLine.length == 0) {
                System.out.println("Invalid input");
                continue;
            }

            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution_MH().getMinDiff(arr, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution_MH {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);


        int res = arr[n - 1] - arr[0];


        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - k < 0)
                continue;

            int minH = Math.min(arr[0]+k,arr[i]-k);
            int maxH = Math.max(arr[i-1]+k,arr[n-1]-k);

            res= Math.min(maxH-minH, res);


        }
        return res;
    }
}