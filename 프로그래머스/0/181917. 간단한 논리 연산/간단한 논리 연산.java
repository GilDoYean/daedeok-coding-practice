class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean middle1 = true;
        boolean middle2 = true;
        if((x1==false && x2==false)){
            middle1 = false;
        }
        if(x3==false && x4==false){
            middle2 = false;
        }
        if(middle1==true && middle2==true){
            answer = true;
        }
        return answer;
    }
}