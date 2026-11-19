class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> letters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            letters.add(s.charAt(i));
        }

        for (int j = 0; j < t.length(); j++){
            int index = letters.indexOf(t.charAt(j));
            if (index == -1){
                return false;
            }
            letters.remove(index);
        }
        return letters.size() == 0;
    }
}
