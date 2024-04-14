class Solution {
    public int solution(String[][] board, int h, int w) {

        String target = board[h][w];

       int answer = check(board, target, h+1, w) + check(board, target, h-1, w) + check(board, target, h, w+1) + check(board, target, h, w-1);

        return answer;
    }


    private int check(String[][] board, String value, int h, int w) {

        try {
            if(board[h][w].equals(value) ){
                return 1;
            }
            return  0;
        }catch (IndexOutOfBoundsException e){
            return 0;
        }
    }
}
