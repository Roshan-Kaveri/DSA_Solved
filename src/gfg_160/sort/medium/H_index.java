package gfg_160.sort.medium;


//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
        import java.util.*;

class H_index {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine().trim());

        while (test_cases-- > 0) {
            // Read the array from input line
            String[] input = br.readLine().trim().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            // Solution_HINX instance to invoke the function
            Solution_HINX ob = new Solution_HINX();
            int result = ob.hIndex(arr);

            System.out.println(result);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution_HINX {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int len = citations.length;
        int[] bucket = new int[len+1];

        for(int c : citations)
            bucket[ Math.min(c,len)]++;
        int count = 0;
        for(int i = len ; i>=0 ; i--){
            count += bucket[i];
            if(count >= i)
                return i;
        }
        return 0;
    }
}