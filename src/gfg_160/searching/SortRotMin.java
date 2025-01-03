//{ Driver Code Starts

package  gfg_160.searching;

import java.util.*;

public class SortRotMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        Solution_SRM ob = new Solution_SRM (); // Instantiate the Solution object once

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length]; // Changed to int[]

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            System.out.println(ob.findMin(arr));
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution_SRM {
    public int findMin(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {
          
            if (arr[lo] < arr[hi])        
                return arr[lo];
               
          
            int mid = (lo + hi) / 2;

            if (arr[mid] > arr[hi])
                lo = mid + 1;
            else
                hi = mid;
        }

        return arr[lo]; 
    }
}