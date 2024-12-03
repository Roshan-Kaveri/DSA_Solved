package arrays.easy;

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351

import java.io.*;
        import java.lang.*;

public class StockSellBuyMultiple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading number of test cases (t)
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {

            String arr[] = br.readLine().split(" ");
            int prices[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                prices[i] = Integer.parseInt(arr[i]);
            }

            // Create an instance of the Solution_SBSM class
            Solution_SBSM ob = new Solution_SBSM();

            // Call the stockBuyAndSell method
            int res = ob.maximumProfit(prices);

            // Print the result
            System.out.println(res);

            // Print the "~" symbol to match the original output
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution_SBSM {
    public int maximumProfit(int prices[]) {
        // code here
        int p = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1])
                p+= prices[i] - prices[i-1];
        }
        return p;
    }
}