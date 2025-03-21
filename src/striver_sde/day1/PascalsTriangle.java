package striver_sde.day1;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> answer = new ArrayList<>();

        for(int i = 1 ; i <= n ; i++) {
            int ans = 1;
            List<Integer> a = new ArrayList<>();
            a.add(1);
            for(int j = 1 ; j < i ; j++ ){
                ans = ans * (i - j) / j;
                a.add(ans);
            }
            answer.add(a);
        }
        return answer;

    }
}