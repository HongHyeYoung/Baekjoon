class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.", "--.","....","..",".---","-.-",".-..", "--","-.","---",".--.","--.-",".-.", "...","-","..-","...-",".--","-..-", "-.--","--.."};
        
        String words[] = letter.split(" ");
        for(String word : words){
            for(int i = 0; i < morse.length; i++){
                if(morse[i].equals(word)){
                    answer += (char) ('a' + i);
                }
            }
        }
        
        return answer;
    }
}