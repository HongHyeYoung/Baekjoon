class Solution {
    public String solution(String s) {
        String answer = "";
        String[] st = s.split("");
        int idx = 0;
        
        
        for(int i=0; i<st.length; i++){
        	
            if(st[i].equals(" ")){
                idx=0;
            }
            
            else if(idx %2 == 0){
            	
                st[i] = st[i].toUpperCase();
                
                idx++;
            }
            
            else{
                st[i] = st[i].toLowerCase();
                
                idx++;
            }
            
            answer += st[i];
        }    
        
        return answer;
    }
}