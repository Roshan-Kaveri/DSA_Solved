package striver_80_roadmap.arrays.faq.medium;

public class Pascal_ii {


        public int[] pascalTriangleII(int r) {
            int[] res = new int[r];
            res[0] = 1;
            for (int i = 1; i < r; i++) {
                res[i] =
                        (res[i - 1] * (r - i)) / i; // each time r reduces by i and demoninator increases by i
            }
            return res;
        }


}
