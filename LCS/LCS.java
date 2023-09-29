public class Main{
    public static int LCS(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[n+1][m+1];
        for (int j = 1; j <= m; j++) {
            for (int i = 1; i <= n; i++) {
                if (text1.charAt(j - 1) == text2.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
}