class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int max2 = 0;
        for(int i=0 ; i<sizes.length ; i++){
            if(sizes[i][0]<sizes[i][1]){
                int n = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = n;
            }
        }
         for(int k=0 ; k<sizes.length ; k++){
         if(sizes[k][0]>max)
             max = sizes[k][0];   
         if(sizes[k][1]>max2)
             max2 = sizes[k][1];
         }
       answer = max * max2;
        return answer;
    }
}