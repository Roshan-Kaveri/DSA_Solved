package striver_a2z.dp.striver.greedy;

import java.util.Arrays;

public class AssignCookie {

        public int maxChildren(int[] greed, int[] cookie) {
            // Your code goes here.
            Arrays.sort(cookie);
            Arrays.sort(greed);
            int N = greed.length;
            int M = cookie.length;

            int i =0;
            int j =0;
            while(i<N && j< M){
                if(greed[i]<=cookie[j]){
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
            return i;


        }

}
