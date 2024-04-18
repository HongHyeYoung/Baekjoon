import java.util.*;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;

      
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<weights.length; i++) {
            map.put(weights[i], map.getOrDefault(weights[i], 0) + 1);
        }

        int size = map.size();
       
        int[] weightArr = new int[size];
        int[] countArr = new int[size];

        int idx = 0;
        for(int key : map.keySet()) {
            weightArr[idx] = key;
            countArr[idx] = map.get(key);
            idx++;
        }


        for(int i=0; i<size; i++) {
            if(countArr[i] > 1) {
                answer += (long) countArr[i] * (countArr[i]-1) / 2;
            }

            int weight1 = weightArr[i]; 
            int people1 = countArr[i]; 
            for(int j=i+1; j<size; j++) {
                int weight2 = weightArr[j]; 

                if (isCouple(weight1, weight2)) { 
                    int people2 = countArr[j]; 

                    answer += (long) people1 * people2; 
                }
            }
        }


        return answer;
    }

    private boolean isCouple(int weight1, int weight2) {
        if(weight1*2 == weight2*3 ||
           weight1*2 == weight2*4 ||
           weight1*3 == weight2*2 ||
           weight1*3 == weight2*4 ||
           weight1*4 == weight2*2 ||
           weight1*4 == weight2*3) {
            return true;
        } else {
            return false;
        }
    }
}