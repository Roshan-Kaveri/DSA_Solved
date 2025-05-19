package striver_sde.day2;

public class MergeArrayNoSpace {

    public static void mergeTwoSortedArraysWithoutExtraSpace(long []arr1, long []arr2){

        int n = arr1.length;
        int m = arr2.length;
        int len = m + n;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {

                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                }
                else if (left >= n) {
                    swapIfGreater(arr2, arr2, left - n, right - n);
                }
                else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++; right++;
            }
            if (gap == 1) break;

            gap = (gap / 2) + (gap % 2);
        }


    }

    public static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }


}
