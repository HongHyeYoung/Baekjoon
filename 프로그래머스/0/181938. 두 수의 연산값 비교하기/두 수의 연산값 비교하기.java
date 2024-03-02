class Solution {
    public static int solution(int a, int b) {
        
        int answer = 0;
        
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        
        int ab1 = Integer.valueOf(a1 + b1);
        int ab2 = 2 * a * b;
        
        if(ab1 > ab2 || ab1 == ab2)
            answer = ab1;
        
        if(ab1 < ab2)
            answer = ab2;
        
        
        return answer;
    }
}