import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        String[] sArray = s.split("");
        int[] answer = new int[sArray.length];
        answer[0] = -1;
        
        for (int i = 1; i < sArray.length; i++) {
            answer[i] = -1;
            for (int j = i-1; j >= 0; j--) {
                if (sArray[j].equals(sArray[i])) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        
        return answer;
    }
}