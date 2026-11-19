class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        int curr = columnNumber;
        if (curr <= 26){
            res += (char)(curr + 64);
            return res;
        }
        while (curr > 26){
            while (curr > 26){
                curr -= 26;
            }
            res += (char)(curr + 64);
            curr = columnNumber;
            int product = curr / 26;
            if (product > 26){
                curr = product;
                columnNumber = curr;
            } else {
                res += (char)(product + 64);
                curr = product;
            }
        }
        char[] result = res.toCharArray();
        int i = 0;
        int j = result.length - 1;
        while (i < j){
            char temp = result[i];
            result[i] = result[j];
            result[j] = temp;
            i += 1;
            j -= 1;
        }
        return new String(result);
    }
}