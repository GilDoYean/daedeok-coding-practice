import java.lang.Integer;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String n2 = Integer.toBinaryString(n);
        n2 = n2.replace("0", "");
        int k = n+1;
        while(true){
            String test = Integer.toBinaryString(k);
            test = test.replace("0", "");
            
            if(n2.equals(test)){
                answer = k;
                break;
            }
            else
              k ++;
        }
        return answer;
    }
}