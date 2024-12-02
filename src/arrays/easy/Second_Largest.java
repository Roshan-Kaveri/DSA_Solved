package arrays.easy;

// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735

import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution_SL ob = new Solution_SL();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

class Solution_SL {
    public int getSecondLargest(int[] arr) {

        if (arr.length < 2) {
            return -1;
        }
        int max = arr[0];
        int second = Integer.MIN_VALUE;
        for (int a : arr) {
            if (max < a) {
                second = max;
                max = a;
            } else if (max != a) {
                second = Math.max(a, second);
            }

        }
        return (second == Integer.MIN_VALUE) ? -1 : second;

    }
}