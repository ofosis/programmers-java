package practice;

import java.util.Scanner;

public class dkdbtgjs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		dkdbtgjs solution = new dkdbtgjs();
//		String[] a = new String[sc.nextInt()];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = sc.next();
//		}
//		sc.nextLine();
//		String[] b = new String[sc.nextInt()];
//		for (int i = 0; i < b.length; i++) {
//			b[i] = sc.next();
//		}
		      String[][] bb = new String[sc.nextInt()][sc.nextInt()];
		      for (int i = 0; i < bb.length; i++) {
		         for (int j = 0; j < bb[i].length; j++) {
		            bb[i][j] = sc.next();
		         }
		      }
		int result = solution.solution(bb,sc.nextInt(),sc.nextInt());
		System.out.println(result);
	}
	
	public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color=board[h][w];
        int[][] direct={{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        for(int i=0; i<direct.length; i++) {
        	int hcheck=h+direct[i][0];
        	int wcheck=w+direct[i][1];
        	if(hcheck>=0 && hcheck<board.length && wcheck>=0 && wcheck<board.length) {
        		if(board[hcheck][wcheck].equals(color)) {
        			answer++;
        		}
        	}
        }
        return answer;
    }

}
