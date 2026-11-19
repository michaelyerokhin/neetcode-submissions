class Solution {
    public boolean isValid(String s) {
        Stack<Character> pairs = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char item : charArray){
            if (item == ']' || item == '}' || item == ')'){
                if (pairs.empty()){
                    return false;
                } else {
                    if (item == ']' && pairs.peek() != '['
                    || item == ')' && pairs.peek() != '('
                    || item == '}' && pairs.peek() != '{'){
                        return false;
                    } else {
                        pairs.pop();
                    }
                }
            } else {
                pairs.push(item);
            }
        }
        return pairs.empty(); 
    }
}
