public void merge(int[] nums1, int m, int[] nums2, int n) {
    int index1 = m - 1;  // Index for the last element in nums1
    int index2 = n - 1;  // Index for the last element in nums2
    int mergedIndex = m + n - 1;  // Index for the last position in the merged array
    
    while (index1 >= 0 && index2 >= 0) {
        if (nums1[index1] > nums2[index2]) {//if true, we want to place element from nums1 into mergedarray
            //to be in sorted order
            nums1[mergedIndex] = nums1[index1];
            index1--;
        } else {
            nums1[mergedIndex] = nums2[index2];
            index2--;
        }
        mergedIndex--;
    }
    
    // If there are remaining elements in nums2, copy them to nums1
    while (index2 >= 0) {
        nums1[mergedIndex] = nums2[index2];
        index2--;
        mergedIndex--;
    }
}

//The algorithm works by starting from the end of both arrays (nums1 and nums2) 
//and comparing their elements. It then fills in the merged array (nums1) from the 
//back to the front, ensuring that the largest elements are placed in the 
//correct positions. This process effectively combines the two sorted arrays 
//into a single sorted array (nums1).