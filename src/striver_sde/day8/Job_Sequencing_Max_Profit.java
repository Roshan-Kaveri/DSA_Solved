package striver_sde.day8;

import java.util.ArrayList;
import java.util.Arrays;

public class Job_Sequencing_Max_Profit {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = deadline.length;
        int[][] job = new int[n][2];

        for(int i = 0 ; i <  n ; i++){
            job[i][0] = deadline[i];
            job[i][1] = profit[i];

        }

        Arrays.sort(job, (a, b) -> b[1] - a[1]);

        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (job[i][0] > maxi) {
                maxi = job[i][0];
            }
        }

        int result[] = new int[maxi + 1];

        for (int i = 1; i <= maxi; i++) {
            result[i] = -1;
        }

        int countJobs = 0, jobProfit = 0;

        for (int i = 0; i < n; i++) {

            for (int j = job[i][0]; j > 0; j--) {

                if (result[j] == -1) {
                    result[j] = i;
                    countJobs++;
                    jobProfit += job[i][1];
                    break;
                }
            }
        }



        ArrayList<Integer> a = new ArrayList<>();
        a.add(countJobs);
        a.add(jobProfit);

        return a;
    }


}
