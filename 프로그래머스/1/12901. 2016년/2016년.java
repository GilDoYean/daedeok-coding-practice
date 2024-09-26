class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int test_day = 0;

        if(a==1){
            test_day = b-1;
        }
        else{
           for(int i=0;i<a-1;i++){
             test_day += days[i];
           }
           test_day = test_day + b - 1;            
        }
        
        test_day = test_day % 7;
        
        if(test_day == 0)
            answer = "FRI";
        else if(test_day == 1)
             answer = "SAT";
        else if(test_day == 2)
             answer = "SUN";
        else if(test_day == 3)
             answer = "MON";
        else if(test_day == 4)
            answer = "TUE";
        else if(test_day == 5)
              answer = "WED";
        else if(test_day == 6)
             answer = "THU";
           
        return answer;
    }
}