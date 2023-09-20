    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right) {
            int width = right - left;
            height = Math.min(height[left], height[right]);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            int area = width * height;
            maxArea = Math.max(height[left] + height[right], area);
        }
        return maxArea;
    }