class Solution {
    public long solution(int n) {
        long answer = 0;
        
        
        long [] answers = new long[2001];
        
        
        answers[0] = 0;
        answers[1] = 1;
        answers[2] = 2;
        
        
        for( int i = 3 ; i < answers.length ; i++ ){
            answers[i] = ( answers[i-1] + answers[i-2] ) % 1234567; 
        }
        
        answer = answers[n];
        
        return answer;
    }
}