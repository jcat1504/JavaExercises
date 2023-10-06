class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int maxLength = 0;
        int[] charCount = new int[26]; // Assuming only lowercase English letters

        while (right < s.length()) {
            // Increment the count of the current character at the right pointer
            charCount[s.charAt(right) - 'A']++;
            
            // Update maxFreq with the maximum character count within the current window
            maxFreq = Math.max(maxFreq, charCount[s.charAt(right) - 'A']);
            
            // If the number of characters to replace exceeds k, move the left pointer
            // right-left+1 is current window
            if (right - left + 1 - maxFreq > k) {
                //if this condition is met, it means there are more characters to replace than allowed
                //so we have to decrement the count at left position to remove char from window
                charCount[s.charAt(left) - 'A']--;
                // Move the left pointer to the right
                left++;
            }
            
            // Update the maximum length of the valid window
            maxLength = Math.max(maxLength, right - left + 1);
            
            // Move the right pointer to the right
            right++;
        }
        
        return maxLength;
    }
}
