class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1){
            return "";
        }
        String prefix = strs[0];
        String currPrefix = "";
        for (int i = 1; i < strs.length; i++){
            for (int j = 0; j < strs[i].length() && j < prefix.length(); j++){
                if (strs[i].charAt(j) == prefix.charAt(j)){
                    currPrefix += strs[i].charAt(j);
                } else {
                    if (j == 0){
                        currPrefix = " ";
                    }
                    break;
                }
            }
            if (currPrefix == " "){
                prefix = currPrefix;
            } else {
                prefix = currPrefix;
                currPrefix = "";
            }
        }
        return prefix.trim();
    }
}