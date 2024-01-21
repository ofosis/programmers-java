package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prac1 solution = new prac1();
		int[] a = new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
//		sc.nextLine();
//		String[] b = new String[sc.nextInt()];
//		for (int i = 0; i < b.length; i++) {
//			b[i] = sc.next();
//		}
		int[][] bb = new int[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < bb.length; i++) {
			for (int j = 0; j < bb[i].length; j++) {
				bb[i][j] = sc.nextInt();
			}
		}
		int result = solution.solution(bb, a);
		System.out.println(result);
	}

	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < moves.length; i++) {
			int grab = moves[i] - 1;
			int idx = 0;
			while (true) {
				if (board[idx][grab] != 0) {
					list.add(board[idx][grab]);
					board[idx][grab]=0;
					break;
				}
				if(idx==board.length-1) {
					break;
				}
				idx++;
			}
			if(list.size()>1) {
				if(list.get(list.size()-1).equals(list.get(list.size()-2))) {
					list.remove(list.size()-1);
					list.remove(list.size()-1);
					answer+=2;
				}
			}
		}
		return answer;
	}

}
