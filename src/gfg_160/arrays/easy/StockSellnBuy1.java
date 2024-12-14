package arrays.easy;

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;

class StockSellnBuy1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int prices[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                prices[i] = Integer.parseInt(arr[i]);
            }
            Solution_MEE obj = new Solution_MEE();
            int res = obj.maximumProfit(prices);
            System.out.println(res);
        }
    }
}


class Solution_MEE {
    public int maximumProfit(int prices[]) {
        // Code here
        int min = prices[0];
        int res = 0;
        for(int a : prices){
            min = Math.min(a,min);

            res = Math.max(res, a - min);
        }
        return res;
    }
}
