class Solution {
public int solution(int n) {
        int answer = 0;
        int count=0;
        for(int i=2; i<=n; i++) {
        	if(Primenumber(i)) {
        		answer+=1;
        	}
        }
        return answer;

    }

	public boolean Primenumber(int i) {
		int num=(int)Math.sqrt(i);
		for(int a=2; a<=num; a++) {
			if(i%a==0) return false;
		}
		return true;
	}
}