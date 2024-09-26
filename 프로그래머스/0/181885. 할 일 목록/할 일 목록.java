class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
       int count2=0;
        for(int i = 0;i<todo_list.length;i++){
       if(finished[i]==false){
           count2 ++;
       }
       }
        String[] answer = new String[count2];
        int count = 0;
        for(int i = 0;i<todo_list.length;i++){
            if(finished[i] == false){
                answer[count] = todo_list[i];
                count ++;
            }
        }
        return answer;
    }
}