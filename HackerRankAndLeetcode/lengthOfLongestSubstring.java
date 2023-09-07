public int lengthOfLongestSubstring(String s) {
    // Get the length of the input string.
    int n = s.length();
    // Initialize a variable to store the maximum length.
    int maxLength = 0;
    // Initialize pointers for the start and end of the current window.
    int start = 0;
    int end = 0;
    // Initialize a HashSet to store unique characters in the current window.
    Set<Character> uniqueChars = new HashSet<>();

    // Start a loop that iterates through the input string.
    while (end < n) {
        // Check if the character at 'end' is not in the HashSet (i.e., it's unique).
        if (!uniqueChars.contains(s.charAt(end))) {
            // Add the character to the HashSet and expand the window to the right.
            uniqueChars.add(s.charAt(end));
            end++;
            // Update 'maxLength' if the current window's length is greater.
            maxLength = Math.max(maxLength, end - start);
        } else {
            // If the character at 'end' is already in the HashSet (repeating character):
            // Remove the character at 'start' from the HashSet and move the window to the right.
            uniqueChars.remove(s.charAt(start));
            start++;
        }
    }

    // Return the maximum length of a substring without repeating characters.
    return maxLength;
}
