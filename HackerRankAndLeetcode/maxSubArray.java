class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
}

//second solution
public static int maxSubArray(int[] nums) {
    int n = nums.length;
    int[] dp = new int[n];

    // Base case
    dp[0] = nums[0];

    // Calculate maximum subarray sum at each index
    for (int i = 1; i < n; i++) {
      dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
    }

    // Find the maximum sum in the 'dp' array
    int maxSum = Integer.MIN_VALUE;
    for (int value : dp) {
      maxSum = Math.max(maxSum, value);
    }

    return maxSum;
}