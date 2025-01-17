package gfg_160.arrays.easy;

public class ProductWithoutSelf {

    // alternate Approach is to use prefix array and suffix array and res = prefix * suffix

    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int prod = 1;
        int z = 0, zindex = -1;

        int[] res = new int[n];

        for(int i = 0; i < n ; i++){
            if(arr[i] == 0){
                z++;
                zindex = i;
                continue;
            }
            prod *= arr[i];

        }

        if(z>1){
            return res;
        }

        if(z==1){
            res[zindex] = prod;
            return res;
        }


        for(int i = 0 ; i < n ; i++){
            res[i] = prod / arr[i];
        }

        return res;

    }




}
