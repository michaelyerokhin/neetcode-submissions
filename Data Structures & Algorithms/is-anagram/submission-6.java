class Solution {
    public boolean isAnagram(String s, String t) {
        char [] first = s.toCharArray();
        char [] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        s = new String(first);
        t = new String(second);
        return s.equals(t);

    }
}
