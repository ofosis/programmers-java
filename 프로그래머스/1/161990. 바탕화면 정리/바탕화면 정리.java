class Solution {
   public int[] solution(String[] wallpaper) {
		int[] answer = new int[4];
		int ymin = Integer.MAX_VALUE;
		int xmin = Integer.MAX_VALUE;
		int ymax = Integer.MIN_VALUE;
		int xmax = Integer.MIN_VALUE;
		for (int i = 0; i < wallpaper.length; i++) {
			if (wallpaper[i].contains("#")) {
				for (int j = 0; j < wallpaper[i].length(); j++) {
					if (wallpaper[i].charAt(j) == '#') {
						if(j<xmin) {
							xmin=j;
							answer[1]=xmin;
						}
						if(i<ymin) {
							ymin=i;
							answer[0]=ymin;
						}
						if(j+1>xmax) {
							xmax=j+1;
							answer[3]=xmax;
						}
						if(i+1>ymax) {
							ymax=i+1;
							answer[2]=ymax;
						}
					}
				}
			}
		}
		return answer;
    }
}