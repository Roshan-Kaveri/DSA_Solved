package DSA_2026.daily.day2;

import java.util.ArrayList;
import java.util.List;

public class orArray {
    public List<Integer> orArray(List<Integer> A) {
        // User code goes here
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.size() - 1; i++) {
            list.add(A.get(i) | A.get(i + 1));
        }


        return list;
    }
}
