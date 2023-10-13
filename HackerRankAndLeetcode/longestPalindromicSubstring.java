public String longestPalindrome(String s) {
    int n = s.length();
    boolean[][] dp = new boolean[n][n];
    int maxLength = 0;
    int start = 0;

    for (int i = 0; i < n; i++) {
        dp[i][i] = true;
        //to make all characters palindromes, we make it true
        if (maxLength < 1) {
            //if condition is true, we found first palindromic string(of length 1)
        //this is initialization step for max palindrome length
            maxLength = 1;
            start = i;
        }
    }

    for (int len = 2; len <= n; len++) {
        for (int i = 0; i <= n - len; i++) {
            //inner loop iterates through all possible starting indices i for substrings
            //of current length len
            int j = i + len - 1;
            //Calculates the ending index j of the current substring based on the starting 
            //index i and the current length len.

            if (s.charAt(i) == s.charAt(j) && (len == 2 || dp[i + 1][j - 1])) {
                //len = 2 is there to correctly identify palindromes in both 2 char substrings
                //and substrings of greater lengths. for 2 char substrings, you don't
                //need to look at substring between them, you can directly consider it a palindrome
                dp[i][j] = true;
                if (len > maxLength) {
                    maxLength = len;
                    start = i;
                }
            }
        }
    }

    return s.substring(start, start + maxLength);
}
