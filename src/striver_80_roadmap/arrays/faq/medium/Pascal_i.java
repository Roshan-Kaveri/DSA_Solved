package striver_80_roadmap.arrays.faq.medium;

public class Pascal_i {
    // https://takeuforward.org/plus/dsa/arrays/faqs-medium/pascals-triangle-i
    int ncr(int n, int r){
        if(r > n-r) r = n-r; // if r is less take r or if n - r is less take n - r (n will get cancelled with lowest among them)

        // base case
        if(r == 1) return n;

        int res = 1;
        // 10/1 * 9/2 * .. only till X/Y ; where Y < r
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1); // i starts from 0 so + 1
        }

        return res;

    }
    public int pascalTriangleI(int r, int c) {
        return ncr(r-1,c-1); // 1 based indexing
    }


}
