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
    

class Solution {
    public static int[] listLengths;

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        listLengths = new int[n];
        for (int i = 0; i < n; i++) {
            listLengths[i] = -1;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, lis(nums, i));
        }
        return max;
    }

    private static int lis(int[] nums, int i) {
        if (listLengths[i] != -1) {
            return listLengths[i];
        }

        int max = 1;
        for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j] && max < listLengths[j] + 1) {
                max = listLengths[j] + 1;
            }
        }

        listLengths[i] = max;
        return max;
    }
}

