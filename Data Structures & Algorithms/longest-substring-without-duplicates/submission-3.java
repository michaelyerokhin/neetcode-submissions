class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> letters = new HashSet<>();
        int longestLen = 0;
        int L = 0;
        int R = 0;
        while (R < s.length()){
            if (letters.contains(s.charAt(R))){
                if (R - L > longestLen){
                    longestLen = R - L;
                }
                L += 1;
                R = L;
                letters.clear();
            } else {
                letters.add(s.charAt(R));
                R += 1;
            }
        }
        if (longestLen > letters.size()) {
            return longestLen;
        } else {
            return letters.size();
        }
    }
}
