class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> allScores = new Stack<Integer>();
        int totalScore = 0;
        for (String item : operations){
            if (item.equals("C")){
                allScores.pop();
            } else if (item.equals("D")){
                allScores.push(allScores.peek() * 2);
            } else if (item.equals( "+")){
                int num1 = allScores.pop();
                int num2 = allScores.pop();
                allScores.push(num2);
                allScores.push(num1);
                allScores.push(num2 + num1);
            } else {
                allScores.push(Integer.parseInt(item));
            }
        }
        while (!allScores.empty()){
            totalScore += allScores.pop();
        }
        return totalScore;  
    }
}