import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        int count = 0;
        for(int i=0;i<my_string.length();i++){
             answer[count] = my_string.substring(count,my_string.length());
             count++;
        }
        Arrays.sort(answer);
        return answer;
    }
}