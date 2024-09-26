import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arrCh = my_string.toCharArray();
        for(char a : arrCh){
            if(Character.isLowerCase(a)==true) answer += Character.toUpperCase(a);
            else answer += Character.toLowerCase(a);
        }
        return answer;
    }
}