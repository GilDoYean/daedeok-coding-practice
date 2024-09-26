class Solution {
    public int[] solution(String myString) {
        String[] test = myString.split("x");
        int n=0;
        if(myString.charAt(myString.length()-1)=='x'){
            n = 1;
        }
        int[] answer = new int[test.length+n];
        for(int i=0;i<test.length;i++){
            answer[i] = test[i].length();
        }
        return answer;
    }
}