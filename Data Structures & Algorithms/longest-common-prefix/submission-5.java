class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            if (longestPrefix.length() < 1){
                break;
            } else {
                int len = longestPrefix.length() > strs[i].length() ? 
                strs[i].length() : longestPrefix.length();
                String newPrefix = "";
                for (int j = 0; j < len; j++){
                    if (longestPrefix.charAt(j) == strs[i].charAt(j)){
                        newPrefix += longestPrefix.charAt(j);
                    } else {
                        break;
                    }
                }
                longestPrefix = newPrefix;
            }
        }
        return longestPrefix;  
    }
}