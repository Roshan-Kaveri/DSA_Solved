package gfg_160.backtracking;

public class WordSearch {
    //{ Driver Code Starts
        public static boolean isWordExist(char[][] mat, String word) {
            int rows = mat.length, cols = mat[0].length;
            boolean[][] taken = new boolean[rows][cols];

            char[] letters = word.toCharArray();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (mat[i][j] == letters[0]) {
                        if (checkAdj(i, j, 0, word, mat, taken)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        private static boolean checkAdj(int i, int j, int idx, String word, char[][] mat, boolean[][] taken) {
            if (idx == word.length()) return true;

            if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || taken[i][j] || mat[i][j] != word.charAt(idx)) {
                return false;
            }

            taken[i][j] = true;

            int[] rowDir = {-1, 1, 0, 0};
            int[] colDir = {0, 0, -1, 1};

            for (int k = 0; k < 4; k++) {
                if (checkAdj(i + rowDir[k], j + colDir[k], idx + 1, word, mat, taken)) {
                    return true;
                }
            }

            taken[i][j] = false;
            return false;
        }
    }
