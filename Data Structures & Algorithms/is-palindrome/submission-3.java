class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int j = 0;
        int i = s.length() - 1;
        while (j < i){
            if (!Character.isDigit(s.charAt(j)) && !Character.isLetter(s.charAt(j))){
                j += 1;
            } else if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))){
                i -= 1;
            } else {
                if (s.charAt(j) != s.charAt(i)){
                    return false;
                }
                i -= 1;
                j += 1;
            }
        }
        return true;
    }
}
