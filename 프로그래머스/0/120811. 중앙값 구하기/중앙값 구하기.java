import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int middle = array.length/2+1;
        int count=1;
        for(int i:array){
           if(count==middle){
               answer = i;
           }
            count++;
        }
        return answer;
    }
}