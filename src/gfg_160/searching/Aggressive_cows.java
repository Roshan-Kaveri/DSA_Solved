package gfg_160.searching;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Aggressive_cows {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution_AC sln = new Solution_AC();
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




// User function Template for Java
class Solution_AC {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int high = stalls[n - 1] - stalls[0], low = 1;

        while(low <= high){
            int mid  = (high + low) / 2;
            if(canPlace(stalls , mid , n, k) == 1){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return high;
    }

    static int canPlace(int[] stalls, int idx ,int n, int k){

        int last = stalls[0];
        int cows = 1;
        for(int i = 1 ; i < n; i++){
            if(stalls[i] - last >= idx){
                last = stalls[i];
                cows++;
            }
            if(cows >= k){
                return 1;
            }
        }
        return 0;
    }
}