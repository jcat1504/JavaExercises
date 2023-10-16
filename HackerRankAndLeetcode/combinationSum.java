import java.util.ArrayList;
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