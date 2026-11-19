class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> items = new Stack<>();
        for (String token : tokens){
            if (token.equals("+") || token.equals("*")  || token.equals("-")  || token.equals("/") ){
                int num = items.pop();
                if (token.equals("+") ){
                    items.push(num + items.pop());
                } else if (token.equals("-") ){
                    items.push(items.pop() - num);
                } else if (token.equals("*") ){
                    items.push(num * items.pop());
                } else {
                    items.push(items.pop() / num);
                } 
            } else {
                items.push(Integer.parseInt(token));
            }
        }
        return items.pop();
    }
}
