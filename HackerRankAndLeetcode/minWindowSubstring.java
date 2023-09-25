public String minWindow(String s, String t) {
    // Create hash maps to store character frequencies for the target and the current window.
    HashMap<Character, Integer> targetMap = new HashMap<>();
    HashMap<Character, Integer> windowMap = new HashMap<>();
    
    // Initialize the targetMap with the character frequencies of string t.
    for (char c : t.toCharArray()) {
        targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
    }

    int left = 0;           // Left pointer of the window.
    int minLen = Integer.MAX_VALUE; // Initialize the minimum window length.
    int minLeft = 0;        // Initialize the left index of the minimum window.
    int requiredChars = targetMap.size(); // Number of unique characters required.
    int formedChars = 0;    // Number of unique characters formed in the current window.

    int right = 0;          // Right pointer of the window.

    // Start sliding the window to the right.
    while (right < s.length()) {
        char currentChar = s.charAt(right);
        windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

        // Check if the current character forms part of the target.
        if (targetMap.containsKey(currentChar) && windowMap.get(currentChar).equals(targetMap.get(currentChar))) {
            formedChars++;
        }

        // Try to minimize the window by moving the left pointer to the right.
        while (left <= right && formedChars == requiredChars) {
            char leftChar = s.charAt(left);

            // Update the minimum window length and left index.
            if (right - left + 1 < minLen) {
                minLen = right - left + 1;
                minLeft = left;
            }

            windowMap.put(leftChar, windowMap.get(leftChar) - 1);

            // Check if a character is removed from the window that is part of the target.
            if (targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)) {
                formedChars--;
            }

            left++; // Move the left pointer to the right.
        }

        right++; // Move the right pointer to the right.
    }

    // Check if a minimum window was found.
    if (minLen == Integer.MAX_VALUE) {
        return "";
    }

    // Return the minimum window substring.
    return s.substring(minLeft, minLeft + minLen);
}
