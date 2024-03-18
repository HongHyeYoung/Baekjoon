class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        int index = 0;
        while (count < k) {
            if (index >= numbers.length) {
                index %= numbers.length;
            }
            answer = numbers[index];
            index += 2;
            count++;
        }
        return answer;
    }
}