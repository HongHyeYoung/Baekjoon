import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] elements) {
        int[] newElements = new int[elements.length * 2];
        
        
       
        for(int i = 0; i < elements.length; i++) {
            newElements[i] = newElements[i + elements.length] = elements[i];
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
           
            for (int k = i; k < i + elements.length; k++) {
                sum += newElements[k];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}