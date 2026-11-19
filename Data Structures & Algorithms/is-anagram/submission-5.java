class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sToWord = s.toCharArray();
        char [] tToWord = t.toCharArray();
        Arrays.sort(sToWord);
        Arrays.sort(tToWord);
        if (Arrays.toString(sToWord).equals(Arrays.toString(tToWord))){
            return true;
        }
        return false;
    }
}
