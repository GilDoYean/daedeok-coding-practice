import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int count = 0;
        Arrays.sort(score);
        List<Integer> rank = new ArrayList<>();
        int trash = score.length % m;
        
        for(int i=trash ; i<score.length ; i++){
            rank.add(score[i]);
        
            if (rank.size() == m) {
                answer += Collections.min(rank) * m;
                rank.clear();
            }
        }

        return answer;
    }
}