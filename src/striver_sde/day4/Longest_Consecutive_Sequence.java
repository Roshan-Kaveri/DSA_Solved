package striver_sde.day4;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        Set<Integer> hs = new HashSet();
        int l = 0;

        for(int k : a){
            hs.add(k);
        }

        for(int k : hs){
            if(!hs.contains(k-1)){
                int cnt = 1;
                int x = k;
                while(hs.contains(x+1)){
                    x++;
                    cnt++;
                }
                l = Math.max(l,cnt);
            }
        }
        return l;
    }
}
