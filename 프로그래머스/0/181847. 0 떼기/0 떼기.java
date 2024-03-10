class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder(n_str);
        int cnt = 0;
        while(sb.charAt(cnt) == '0') cnt++;
        sb.delete(0, cnt);
        return sb.toString();
    }
}