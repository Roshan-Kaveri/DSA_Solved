package sort.medium;
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class CountInversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new S_CINV().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class S_CINV {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int n = arr.length;
        return mergeSort(arr, 0, n - 1);
    }
    static int merge(int arr[], int beg, int mid, int end) {
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            LeftArray[i] = arr[beg + i];
        for (int j = 0; j < n2; j++)
            RightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = beg;
        int cnt = 0;


        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
                cnt += (n1 - i);
            }
            k++;
        }


        while (i < n1) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }


        while (j < n2) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }

        return cnt;
    }

    static int mergeSort(int arr[], int beg, int end) {
        int invCount = 0;
        if (beg < end) {
            int mid = (beg + end) / 2;
            invCount += mergeSort(arr, beg, mid);
            invCount += mergeSort(arr, mid + 1, end);
            invCount += merge(arr, beg, mid, end);
        }
        return invCount;
    }
}