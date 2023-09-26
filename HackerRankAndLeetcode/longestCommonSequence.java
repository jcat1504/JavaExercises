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
        