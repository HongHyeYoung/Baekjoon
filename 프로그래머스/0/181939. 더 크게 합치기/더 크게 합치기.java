class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);  
        
        String ab = ""+a1+b1;
        String ba = ""+b1+a1;
        
        int ab1 =Integer.valueOf(ab);
        int ba1 =Integer.valueOf(ba);
        
        if(ab1>ba1)
            answer =ab1;
        else {
            answer =ba1;
        }
        
        if(ab1==ba1)
            answer =ab1;
        
        return answer;
    }
}