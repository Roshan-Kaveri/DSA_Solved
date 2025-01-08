package gfg_160.arrays.easy;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Good_Array {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String a[] = br.readLine().split(" ");
            int arr[] = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                arr[i] = Integer.parseInt(a[i]);
            }
            int k = Integer.parseInt(br.readLine());
            Solution_GA obj = new Solution_GA();
            int res = obj.goodArray(arr, k);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution_GA {
    public int goodArray(int arr[], int k) {
        // Code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0) + 1 );
        }

        int e = 0;
        for(int nums : freq.keySet()){
            int cn = freq.get(nums);
            if(k == 0 ){
                if(cn % 2 != 0){
                    e++;
                }
            }else {

                int r = nums ^ k;
                int cr = freq.getOrDefault(r,0);

                if(cn > cr){
                    e+=cn-cr;
                }
            }
        }
        return e;
    }
}