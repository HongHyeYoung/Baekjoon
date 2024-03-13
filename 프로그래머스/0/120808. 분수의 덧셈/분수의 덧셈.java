class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int denum = (denum1*num2)+(denum2*num1);
        int num = num1*num2;
        int n = gcd(denum, num);
        answer[0] = denum/n;
        answer[1] = num/n;
        return answer;
    }
    public static int gcd(int num1, int num2)
    {
        if(num1%num2 == 0)
        {
            return num2;
        }
        return gcd(num2, num1%num2);
    }
        
}