class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        while(age > 0) {
            int num = age % 10;
            sb.append( (char)('a'+num) );
            age /= 10;
        }
        
        return sb.reverse().toString();
    }
}