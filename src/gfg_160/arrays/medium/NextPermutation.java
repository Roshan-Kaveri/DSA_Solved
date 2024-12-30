package gfg_160.arrays.easy;//{ Driver Code Starts

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


// } Driver Code Ends
// User function Template for Java


// code here


// User function Template for Java

class Solution_NP {
    static void nextPermutation(int n, int[] a) {
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            int ind = -1;

            for (int i = n - 1; i > index; i--) {
                if (a[i] > a[index]) {
                    ind = i;
                    break;
                }
            }


            int temp = a[ind];
            a[ind] = a[index];
            a[index] = temp;
        }
        reverseSubArray(a, index + 1, n - 1);
        List<Integer> inte = new ArrayList();
        for (int i : a) {
            inte.add(i);
        }
        for (int i = 0; i < n; i++)
            a[i] = inte.get(i);

    }

    public static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}


//{ Driver Code Starts.

public class NextPermutation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution_NP ob = new Solution_NP();
            Solution_NP.nextPermutation(N,arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends