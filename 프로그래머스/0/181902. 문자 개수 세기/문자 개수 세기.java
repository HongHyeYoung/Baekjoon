class Solution {
    	public int[] solution(String my_string) {
		int[] answer = new int[52];
		int idx = 0;
		String [] arr = my_string.split("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches("[A-Z]")) {
				idx = arr[i].charAt(0) - 65;
				answer[idx]++;
			}
			else if(arr[i].matches("[a-z]")){
				idx = arr[i].charAt(0) - 71;
				answer[idx]++;
			}
		}
		return answer;
	}

}