class Solution {
    public int minimumRecolors(String blocks, int k) {
        int total = 0;
        for (int i = 0; i < blocks.length(); i++){
            if (blocks.charAt(i) == 'W'){
                total += 1;
            }
            if (i + 1 == k){
                break;
            }
        }

        int result = total;
        for (int j = k; j < blocks.length(); j++){
            if (blocks.charAt(j - k) == 'W'){
                total -= 1;
            }
            if (blocks.charAt(j) == 'W'){
                total += 1;
            }

            result = Math.min(result, total);
        }
        return result;

    }
}