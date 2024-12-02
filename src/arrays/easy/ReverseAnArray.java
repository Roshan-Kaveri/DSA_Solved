package arrays.easy;

//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array

//{ Driver Code Starts
import java.io.*;

public class ReverseAnArray {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution_RAA obj = new Solution_RAA();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution_RAA {
    public void reverseArray(int arr[]) {
        // code here
        int  n = arr.length;
        for(int i = 0 ; i< n/2 ; i++){
            arr[i] = arr[i] ^ arr[n - i - 1];
            arr[n - i - 1] = arr[i] ^ arr[n - i - 1];
            arr[i] = arr[i] ^ arr[n - i - 1];
        }
    }
}

