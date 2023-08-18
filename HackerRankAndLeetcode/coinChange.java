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
