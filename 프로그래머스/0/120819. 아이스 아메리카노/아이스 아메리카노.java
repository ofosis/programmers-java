class Solution {
    public int[] solution(int n) {
        int[] answer=new int[2];
		answer[0]=n/5500;
		answer[1]=n%5500;
		return answer;
    }
}