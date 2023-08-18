public int climbStairs(int n) {
    if (n<= 1){
        return 1;
    }

    int[] dp = new int[n+1];
    dp[1] = 1; //since there's only one way to reach each step
    d[2] = 2;//there are two ways to reach second step

    for(int i = 3; i<=n; i++) {
        //adds number of ways to reach previous step
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n]
    }
}

//loop starts from 3 because we already calculated and stored base cases for first 
// 2 steps. from third step onwards, we will calculate

public int climbStairs(int n) {
    if(n<=1) return 1;
    int prev1 = 1; int prev2 = 2;
    for(int i=3; i<=n;i++) {
        int nextVal = prev1 + prev2;
        prev1 = prev2;
        prev2 = nextVal;
    }
    return nextVal;
}