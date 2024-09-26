class Solution {
    public String solution(String myString) {
        String answer = "";
         for(char c : myString.toCharArray()) {
	           if(Character.isLowerCase(c))
	                 c =  Character.toUpperCase(c);
               else
	                c =  c;
	                
	                answer += c;
	                
	        }
        return answer;
    }
}