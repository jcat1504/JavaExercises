 public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(); int n = text2.length();
        return helper(text1, text2, m, n);
    }

        public int helper(String text1, String text2, int m, int n) {
            if(m==0 || n == 0) return 0;

            if(text1.charAt(m-1) == text2.charAt(n-1)) {
                //increment length by 1 and check previous character
                //keep repeating til we get to end
                return + 1 + helper(text1, text2, m-1,n-1);
            } else {
                int lcs1 = helper(text1, text2, m-1, n);
                int lcs2 = helper(text1, text2, m, n-1);
                return Math.max(lcs1, lcs2);
            }
}

//O(m*n) for time and space

public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length(); int n = text2.length();
    int[][] dp = new int[m+1][n+1];
    for(int i = 0; i<=m; i++) {
        dp[i][0] = 0;
    }
    for(int j = 0; j<=n; j++) {
        dp[0][j] = 0;
    }

    for(int i=1; i<=m; i++) {
        for(int j=1; j<=n; j++) {
            if(text1.charAt(i-1) == text2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    return dp[m][n];
}