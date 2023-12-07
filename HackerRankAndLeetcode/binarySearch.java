    public int search(int[] nums, int target) {
        int index = -1;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == target) {
                index = i;
                break;
            } 
        }
        return index;
    }

    //solution 1


public int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
}

//solution 2