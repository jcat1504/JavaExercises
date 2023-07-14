class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}


  public boolean isPalindrome(String s) {
        if(s == null) return false;
        if(s.isEmpty()) return true;
        
        int i = 0, j = s.length() - 1;
        
        while(i < j){
            while( i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            if(i >= j) break;

            while( i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(i >= j) break;

            if(Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) return false;
        }
        
        return true;
    }