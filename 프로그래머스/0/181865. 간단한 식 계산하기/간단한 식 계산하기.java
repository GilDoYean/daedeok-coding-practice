class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] test = binomial.split(" ");
       
        switch(test[1]){
         case "+":
            answer = Integer.parseInt(test[0]) + Integer.parseInt(test[2]);
                break;
         case "-":
            answer = Integer.parseInt(test[0]) - Integer.parseInt(test[2]);
                 break;
         case "*":
            answer = Integer.parseInt(test[0]) * Integer.parseInt(test[2]);
                 break;
        }
        return answer;
    }
}