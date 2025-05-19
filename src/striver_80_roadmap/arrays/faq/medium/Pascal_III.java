package striver_80_roadmap.arrays.faq.medium;

import java.util.ArrayList;
import java.util.List;

public class Pascal_III {


        public List<List<Integer>> pascalTriangleIII(int n) {
            List<List<Integer>> final_list = new ArrayList<>();
            for(int r = 1 ; r <= n; r++){
                List<Integer> res = new ArrayList<>();
                res.add(1);
                for (int i = 1; i < r; i++) {
                    res.add((res.get(i-1) * (r - i)) / i); // each time r reduces by i and demoninator increases by i
                }
                final_list.add(res);

            }
            return final_list;
        }


}
