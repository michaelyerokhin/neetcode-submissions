class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len = str2.length();
        boolean worked = true;
        while (len > 0){
            if (str2.length() % len != 0){
                len -= 1;
            } else {
                int additions = str2.length() / len;
                String possibleString = str2.substring(0,len);
                String concats = "";
                while (additions > 0){
                    concats += possibleString;
                    additions -= 1;
                }
                if (concats.equals(str2)){
                    if (str1.length() % len == 0){
                        worked = true;
                        int i = 0;
                        while (i < str1.length()){
                            if (str1.substring(i,i+len).equals(possibleString)){
                                i = i + len; 
                            } else {
                                worked = false;
                                break;
                            }
                        }
                        if (worked){
                            return possibleString;
                        }
                    } 
                }
                len -= 1; 
            }
        }
        return "";  
    }
}