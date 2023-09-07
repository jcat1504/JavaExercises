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
    // Declare an array to store the lengths of increasing subsequences
    public static int[] listLengths;

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        // Initialize the listLengths array with -1 (to indicate not computed)
        listLengths = new int[n];
        for (int i = 0; i < n; i++) {
            listLengths[i] = -1;
        }

        int max = 0;
        // Iterate through each element and find the length of LIS starting from it
        for (int i = 0; i < n; i++) {
            // Find the maximum LIS length starting from the current element
            max = Math.max(max, lis(nums, i));
        }
        return max; // Return the maximum LIS length
    }

    // Recursive function to find the length of LIS starting from index i
    private static int lis(int[] nums, int i) {
        // If the LIS length starting from index i is already computed, return it
        if (listLengths[i] != -1) {
            return listLengths[i];
        }

        int max = 1;
        // Iterate through all previous elements and find the maximum LIS length
        // that can be extended from them
        for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j] && max < listLengths[j] + 1) {
                max = listLengths[j] + 1;
            }
        }

        // Store the computed LIS length for index i and return it
        listLengths[i] = max;
        return max;

