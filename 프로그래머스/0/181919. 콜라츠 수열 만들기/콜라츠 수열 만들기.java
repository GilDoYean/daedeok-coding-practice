import java.util.ArrayList;
import java.util.List;
class Solution {
    public List solution(int n) {
        List<Integer> names = new ArrayList<>();

        while(n!=1){
            names.add(n);  
            if(n%2==0)
                n = n/2;
            else if(n%2==1)
                 n = 3 * n + 1;          
        }
        names.add(1);  
         return names;
    }
}