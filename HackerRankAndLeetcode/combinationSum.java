import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currSum = new ArrayList<>(); 
        backtrack(candidates, target, 0, currSum, result);
        return result;
    }
    private void backtrack(int[] candidates, int remaining, int start, List<Integer> currSum, List<List<Integer>> result) {
        if(remaining<0) {
            return;
        }
        if(remaining ==0) {
            result.add(new ArrayList<>(currSum));
            return;
        }
        for(int i = start; i < candidates.length; i++) {
            currSum.add(candidates[i]);
            backtrack(candidates, remaining - candidates[i], i, currSum, result);
            //continue looking for remaining in sum
            currSum.remove(currSum.size() - 1);
            //backtracking - remove last candidate so we can move on and search for the next
        }
    }
}

//second solution with dp

public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    LList<List<Integer>>[] dp = new ArrayList[target + 1];
    
    for (int t = 0; t <= target; t++) {
        dp[t] = new ArrayList();
        
        List<List<Integer>> combList = new ArrayList();
        
        for (int j = 0; j < candidates.length && candidates[j] <= t; j++) {
            if (candidates[j] == t) {
                combList.add(Arrays.asList(candidates[j])); // itself can form a list
            } else {
                for (List<Integer> prevlist : dp[t - candidates[j]]) { 
                    if (candidates[j] >= prevlist.get(prevlist.size() - 1)) {
                        List temp = new ArrayList(prevlist); 
                        temp.add(candidates[j]); 
                        combList.add(temp);
                    }
                }
            }
        }
        dp[t] = combList;
    }
    return dp[target];
}