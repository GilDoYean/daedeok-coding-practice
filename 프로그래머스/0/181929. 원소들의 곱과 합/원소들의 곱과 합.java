class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int ans1=1;
        int ans2=0;
        for(int i=0;i<num_list.length;i++){
            ans1 *= num_list[i];
            ans2 += num_list[i];
        }
        if(ans1<ans2*ans2){
            answer = 1;
        }
        return answer;
    }
}