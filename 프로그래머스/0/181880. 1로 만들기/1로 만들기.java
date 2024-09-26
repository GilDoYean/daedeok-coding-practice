class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0 ; i<num_list.length ; i++){
            int test = num_list[i];
            while(test!=1){
            if(test%2==0)
                test /= 2;
                else
                    test = (test-1)/2;
                
                answer +=1;
               }
        }
        return answer;
    }
}