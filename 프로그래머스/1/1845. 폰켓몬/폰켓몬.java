class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        for(int i=1 ; i<nums.length ; i++){
            boolean ans = false;
            for(int j=0 ; j<i ; j++){
                if(nums[i] == nums[j]){
                   ans = true;
                }
            }
            if(ans==false&&answer<(nums.length/2))
                answer += 1;
        }
            
        return answer;
    }
}