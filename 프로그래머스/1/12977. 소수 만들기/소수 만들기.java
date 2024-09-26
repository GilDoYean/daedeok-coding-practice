class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0 ; i<nums.length-2 ; i++){
            for(int k = i+1; k<nums.length-1 ; k++){
                for(int j = k+1; j<nums.length ; j++){
                    int test = nums[i] + nums[k] + nums[j];
                    int test2 = 0;
                    for(int n = 1; n<=test ; n++){
                        if(test%n==0){
                            test2++;
                        }
                    }
                    if(test2==2){
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
}