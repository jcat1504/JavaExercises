public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}

public boolean isAnagram(String s, String t) {
    if(s.length() != t.length())    return false;

     char[] c1 = s.toCharArray();
     char[] c2 = t.toCharArray();
     int[] alpha = new int[26];
     
     for(int i = 0; i < c1.length; ++i) {
         alpha[c1[i] - 'a']++;
         alpha[c2[i] - 'a']--;
     }
     
     for(int num: alpha) {
         if(num != 0)    return false;
     }
     return true;
 }

 //second solution