import java.util.*;
class Solution {
    static PriorityQueue<Integer> queue;
    public int solution(int[] cards) {
        int answer = 0;
        
        
        int n = cards.length;
        boolean[] visited = new boolean[n];
        
        
        queue = new PriorityQueue<>(Collections.reverseOrder());
        
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(cards, i, visited, 0);
            }
        }
        
        
        if(queue.size() != 1) {
            answer = queue.poll() * queue.poll();    
        }
        
        return answer;
    }
    static void dfs(int[] cards, int num, boolean[] visited, int cnt) {
        
        if(visited[num]) {
            
            queue.add(cnt);
            return;
        }
        visited[num] = true;
        dfs(cards, cards[num] - 1, visited, cnt + 1);
    }
}