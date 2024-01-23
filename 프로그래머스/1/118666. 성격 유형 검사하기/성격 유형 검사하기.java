class Solution {
    public String solution(String[] survey,int[] choices) {
        String answer = "";
        char[] personality= {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        int[] list= {3,2,1,0,1,2,3};
        int[] point=new int[8];
        for(int i=0; i<survey.length; i++) {
        	char what = '\0';
        	if(choices[i]<4) {
        		what=survey[i].charAt(0);
        	}
        	else if(choices[i]>4) {
        		what=survey[i].charAt(1);
        	}
        	else {
        		continue;
        	}
        	for(int j=0; j<personality.length; j++) {
        		if(what==personality[j]) {
        			point[j]+=list[choices[i]-1];
        			break;
        		}
        	}
        }
        for(int i=0; i<personality.length; i=i+2) {
        	if(point[i]<point[i+1]) {
        		answer+=personality[i+1];
        	}
        	else if(point[i]>point[i+1]) {
        		answer+=personality[i];
        	}
        	else {
        		if(personality[i]>personality[i+1]) {
        			answer+=personality[i+1];
        		}
        		else {
        			answer+=personality[i];
        		}
        	}
        }
        return answer;
    }
}