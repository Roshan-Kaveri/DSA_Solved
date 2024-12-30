package striver_sde.dp;

//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class SetMaxZeros {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            new S_SMZ().setMatrixZeroes(arr);
            for (int[] row : arr) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class S_SMZ {
    public void setMatrixZeroes(int[][] matrix) {
        int col0 = 1;

        for(int i = 0 ; i < matrix.length; i ++){
            for(int j = 0; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;

                    if(j==0)
                        col0=0;
                    else
                        matrix[0][j] = 0;

                }
            }
        }


        for(int i = 1 ; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length ; j++){
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }

            }

        }


        if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }



    }
}