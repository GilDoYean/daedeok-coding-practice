class Solution {
    public String[] solution(String[] names) {
        int n=1;
        if(names.length%5==0)
            n=0;
        else
            n=1;
        String[] answer = new String[(names.length/5)+n];
        int count=0;
        for(int i=0;i<names.length;i++){
            if(i%5==0){
            answer[count] = names[i];
            count ++;
            }
        }
        return answer;
    }
}