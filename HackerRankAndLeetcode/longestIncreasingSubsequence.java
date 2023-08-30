import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] list = new int[n];
        Arrays.fill(list, 1);

        for(int i = 1; i<n; i++) {
            for(int j = 0; j<i; j++) {
                if(nums[i] > nums[j]){
                    list[i] = Math.max(list[i], list[j] + 1);
                }
            }
        }
                int max = 0;
                for(int lengthList : list) {
                    max = Math.max(max, lengthList);
                }
                return max;
            }
        }