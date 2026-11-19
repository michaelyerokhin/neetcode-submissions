class Solution {
    public boolean checkInclusion(String s1, String s2) {
        String s1Copy = s1;
        int l = 0;
        int r = 0;
        while (r < s2.length()){
            if (s1Copy.length() < 1){
                return true;
            }
            if (s1Copy.contains("" + s2.charAt(r))){
                s1Copy = s1Copy.replaceFirst("" + s2.charAt(r),"");
                r += 1;
            } else {
                l += 1;
                r = l;
                s1Copy = s1;
            }
        }
        return (s1Copy.length() < 1);
    }
}
