import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0 ;


        char []bArr = before.toCharArray();
        char[]aArr = after.toCharArray();
        

      
        Arrays.sort(bArr);
        Arrays.sort(aArr);
        
        if( String.valueOf(bArr).equals(String.valueOf(aArr)))
            answer = 1;
        else
            answer = 0;
        
        return answer;
    }
}