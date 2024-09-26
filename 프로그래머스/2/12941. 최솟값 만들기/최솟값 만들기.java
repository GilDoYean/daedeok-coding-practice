import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        List<Integer> strList1 = new ArrayList<>();
        List<Integer> strList2 = new ArrayList<>();
        for(Integer a : A){ strList1.add(a); }
        for(Integer b : B){ strList2.add(b); }
         Collections.sort(strList1);
         Collections.sort(strList2, Collections.reverseOrder());

        for(int a=0 ; a < strList1.size() ; a++){
            answer += strList1.get(a) * strList2.get(a);
        }
        
        return answer;
    }
}