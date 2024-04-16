import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Queue<Integer> basis = new LinkedList<>();
        Stack<Integer> assist = new Stack<>();
        for(int i = 1 ; i <= order.length; i++)
            basis.add(i);
        
     
        for(int curFind = 0; curFind < order.length; curFind++){
           
            if(!basis.isEmpty() && !assist.isEmpty() && basis.peek() > order[curFind] && assist.peek() > order[curFind])
                break;
            
           
            if(!assist.isEmpty() && assist.peek() == order[curFind]){
                assist.pop();
                answer++;
                continue;
            }
            
           
            if(!basis.isEmpty() && order[curFind] >= basis.peek()){
                
                while(basis.peek() < order[curFind]){
              
                    assist.add(basis.remove());
                }

                basis.remove();
                answer++;
            }
        }
        
        
        return answer;
    }
}