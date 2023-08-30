public int coinChange(int[] coins, int amount) {
    // Check for invalid inputs
    if (coins == null || coins.length == 0 || amount < 1)
        return 0;
    
    // Initialize a queue for BFS and a set for visited amounts
    Deque<Integer> queue = new ArrayDeque<Integer>();
    Set<Integer> visited = new HashSet<Integer>();
    
    // Add the target amount to the queue and mark it as visited
    queue.addFirst(amount);
    visited.add(amount);
    
    // Initialize the level counter
    int level = 0;
    
    // Start the BFS traversal
    while (!queue.isEmpty()) {
        int size = queue.size();
        
        // Process the nodes at the current level
        while (size-- > 0) {
            int curr = queue.removeLast();
            
            // If the current amount is zero, return the level
            if (curr == 0)
                return level;
            
            // Skip negative amounts
            if (curr < 0)
                continue;
            
            // Explore next possible amounts using each coin
            for (int coin : coins) {
                int next = curr - coin;
                
                // If the next amount is valid and not visited, add to queue and mark visited
                if (next >= 0 && !visited.contains(next)) {
                    queue.addFirst(next);
                    visited.add(next);
                }
            }
        }
        
        // Move to the next level
        level++;
    }
    
    // If no solution is found, return -1
    return -1;
}


public int coinChange(int[] coins, int amount) {
    // Initialize an array to store the minimum number of coins needed for each amount
    int[] dp = new int[amount + 1];
    
    // Initialize the dp array with a value greater than the maximum possible amount
    //.fill assigns same val to all elements in array
    //initializes the dp array with the value amount + 1, effectively setting all elements of the 
    //array to a value that's greater than the maximum possible amount.
    Arrays.fill(dp, amount + 1);
    
    // Set the base case: minimum coins needed to make amount 0 is 0
    dp[0] = 0;
    
    // Loop through amounts from 1 to the target amount
    for (int i = 1; i <= amount; i++) {
        // Loop through each coin
        for (int c : coins) {
            // Update dp[i] if the current coin can be used to reduce the number of coins needed
            //dp[i - c] is the minimum number of coins needed to make the amount i - c,
            //and by adding 1, you are essentially counting the current coin c that you're using.
            //math.min is us comparing the two:current known min num of coins and val using coin c
            if (i >= c) {
                dp[i] = Math.min(dp[i], dp[i - c] + 1);
            }
        }
    }
    
    // If dp[amount] is still greater than the target amount, no solution is possible so return -1
    return dp[amount] > amount ? -1 : dp[amount];
}
