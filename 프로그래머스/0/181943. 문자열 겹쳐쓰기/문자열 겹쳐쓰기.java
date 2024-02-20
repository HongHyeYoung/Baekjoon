class Solution {
    public String solution(String my_string, String overwrite_string, int s) {

		String myStr = my_string;
		String overStr = overwrite_string;

		return myStr.substring(0, s) + overStr + my_string.substring(overStr.length() + s);

	}

}