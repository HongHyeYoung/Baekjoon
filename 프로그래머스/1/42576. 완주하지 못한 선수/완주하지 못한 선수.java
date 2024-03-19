// ver1
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> race = new HashMap<String, Integer>();
        
        // 참가자 명단
        for(int i = 0; i < participant.length; i++) {
            if(race.get(participant[i]) != null) {
                int num = race.get(participant[i]);
                race.put(participant[i], num + 1);
            } else {
                race.put(participant[i], 1);
            }
        }
        // mislav = 1, stanko = 1, mislav = 1, ana = 1
        
        // 완주자 명단 : 완주한 사람들의 값을 -1
        for(int i = 0; i < completion.length; i++) {
            race.put(completion[i], race.get(completion[i]) - 1);
        }
        
        // stanko = 0, mislav = 1, ana = 0
        
        // 완주하지 못한 선수
        for (int i = 0; i < participant.length; i++) {
            if(race.get(participant[i]) != 0) {
                answer = participant[i];
                break;
            }
        }
        
        return answer;
    }
}