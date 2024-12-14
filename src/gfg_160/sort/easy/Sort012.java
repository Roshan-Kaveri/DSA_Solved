package gfg_160.sort.easy;

//{ Driver Code Starts
import java.io.*;
        import java.util.*;

class Sort012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution_S012 ob = new Solution_S012();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution_S012 {
    // Function to gfg_160.sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        // code here 
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            switch(arr[mid]){
                case 0: arr[mid++] = arr[low]; arr[low++] = 0; break;
                case 1: mid++; break;
                case 2: arr[mid]=arr[high]; arr[high--] = 2 ; break;
            }

        }

    }
}

//{ Driver Code Starts.
// } Driver Code Ends