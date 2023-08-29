class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == target) {
                return mid; // If the middle element is the target, return its index
            }
            
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Search in the left half of the current sorted region
                } else {
                    left = mid + 1; // Search in the right half of the current sorted region
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Search in the right half of the current sorted region
                } else {
                    right = mid - 1; // Search in the left half of the current sorted region
                }
            }
        }
        
        return -1; // Target not found in the array
    }
}
