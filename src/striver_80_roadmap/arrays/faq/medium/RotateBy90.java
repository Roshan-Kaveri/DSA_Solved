package striver_80_roadmap.arrays.faq.medium;

public class RotateBy90 {
        public void rotateMatrix(int[][] matrix) {

            int n = matrix.length;

            // transpse and rotate each row
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - j - 1];
                    matrix[i][n - j - 1] = temp;
                }
            }
        }

}
