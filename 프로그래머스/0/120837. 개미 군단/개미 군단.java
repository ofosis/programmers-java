class Solution {
    public int solution(int a) {
        int answer=0;
		answer=a/5;
		a%=5;
		answer+=a/3;
		answer+=a%3;
	return answer;
    }
}