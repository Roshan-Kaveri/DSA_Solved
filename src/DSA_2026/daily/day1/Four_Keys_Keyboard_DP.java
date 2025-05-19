package DSA_2026.daily.day1;

public class Four_Keys_Keyboard_DP {

        public int maxA(int n) {
            if (n <= 5)
                return n;
            int[] dp = new int[n + 10];

            dp[1] = 1;
            for (int i = 1; i <= n; i++) {
                // Press 'A'
                dp[i + 1] = Math.max(dp[i + 1], dp[i] + 1);
                // Use Ctrl-A, Ctrl-C, and Ctrl-V
                dp[i + 3] = Math.max(dp[i + 3], 2 * dp[i]);
                dp[i + 4] = Math.max(dp[i + 4], 3 * dp[i]);
                dp[i + 5] = Math.max(dp[i + 5], 4 * dp[i]);
            }
            return dp[n];
        }

}
