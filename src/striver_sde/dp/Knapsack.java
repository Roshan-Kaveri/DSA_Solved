package striver_sde.dp;

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Knapsack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            // Read capacity
            int capacity = Integer.parseInt(br.readLine());

            // Read values
            String[] valInput = br.readLine().split(" ");
            int[] val = new int[valInput.length];
            for (int i = 0; i < valInput.length; i++) {
                val[i] = Integer.parseInt(valInput[i]);
            }

            // Read weights
            String[] wtInput = br.readLine().split(" ");
            int[] wt = new int[wtInput.length];
            for (int i = 0; i < wtInput.length; i++) {
                wt[i] = Integer.parseInt(wtInput[i]);
            }

            // Call the knapSack function and print the result
            System.out.println(Solution_KS.knapSack(capacity, val, wt));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution_KS {
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here

        if (capacity == 0 || val.length == 0 || wt.length == 0) {
            return 0;
        }

        int prev[] = new int[capacity + 1];

        for(int w = wt[0] ; w <= capacity ; w++)
            prev[w] = val[0];

        for(int ind = 1 ; ind < val.length ; ind++){
            for(int w = capacity; w >= 0 ; w--){
                int nottake = 0 + prev[w];
                int take = Integer.MIN_VALUE;
                if(wt[ind] <= w){
                    take = val[ind] + prev[w - wt[ind]];
                }
                prev[w] = Math.max(take,nottake);
            }
        }

        return prev[capacity];



    }
}
