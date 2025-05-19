package striver_sde.day9;

import java.util.ArrayList;

public class AllSubsetsSum {

    ArrayList<Integer> subsetSums(int[] arr) {
        int n = arr.length;
        // code here
        ArrayList<Integer>res=new ArrayList<>();

        solve(res,n,0,0,arr);
        return res;
    }
    private void solve(ArrayList<Integer> res, int n, int i, int sum, int[] arr){
        if(i==n){
            res.add(sum);
            return;
        }

        solve(res,n,i+1,sum+arr[i],arr);

        solve(res,n,i+1,sum,arr);
    }

}
