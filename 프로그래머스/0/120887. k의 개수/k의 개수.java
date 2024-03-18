class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String istr = "";
        
        for(; i <= j ; i++){ istr += Integer.toString(i); }
        
        String[] check = istr.split("");
        
        for(int idx=0; idx<check.length; idx++){
            if(check[idx].contains(Integer.toString(k)) ) answer++;
        }

        return answer;
    }
}