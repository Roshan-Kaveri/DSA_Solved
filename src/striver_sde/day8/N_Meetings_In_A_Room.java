package striver_sde.day8;

import java.util.Arrays;
import java.util.Comparator;

public class N_Meetings_In_A_Room {

    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length;
        int[][] meet = new int[n][2];

        for(int i = 0 ; i < n ; i++){
            meet[i][0] = start[i];
            meet[i][1] = end[i];
        }

        Arrays.sort(meet, Comparator.comparingInt(o -> o[1]));


        int e = meet[0][1];
        int k = 1;

        for(int i = 1 ; i < n ; i++){
            if(meet[i][0] > e  ){
                e = meet[i][1];
                k++;
            }
        }

        return k;

    }
}
