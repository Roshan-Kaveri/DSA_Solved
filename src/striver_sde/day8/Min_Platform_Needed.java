package striver_sde.day8;

import java.util.Arrays;

public class Min_Platform_Needed {
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(dep);
        Arrays.sort(arr);

        int n = dep.length;
        int p = 1;
        int max = 1;
        int i = 1, j = 0;
        while(i < n && j < n) {

            if(arr[i] > dep[j]){
                p--;
                j++;
            }else{
                p++;
                i++;
            }

            max =  Math.max(p, max);



        }

        return max;
    }
}
