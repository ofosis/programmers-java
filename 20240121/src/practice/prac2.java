package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prac2 solution = new prac2();
		int[] a = new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
//		sc.nextLine();
//		String[] b = new String[sc.nextInt()];
//		for (int i = 0; i < b.length; i++) {
//			b[i] = sc.next();
//		}
//		int[][] bb = new int[sc.nextInt()][sc.nextInt()];
//		for (int i = 0; i < bb.length; i++) {
//			for (int j = 0; j < bb[i].length; j++) {
//				bb[i][j] = sc.nextInt();
//			}
//		}
		String result = solution.solution(a, sc.next());
		System.out.println(result);
	}

	public String solution(int[] numbers, String hand) {
		String answer = "";
		int currentright = 12;
		int currentleft = 10;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				currentleft = numbers[i];
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				currentright = numbers[i];
			} else {
				int lefttomid = Distance(currentleft, numbers[i]);
				int righttomid = Distance(currentright, numbers[i]);

				if (lefttomid > righttomid) {
					answer += "R";
					currentright = numbers[i];
				} else if (lefttomid < righttomid) {
					answer += "L";
					currentleft = numbers[i];
				} else {
					if (hand.equals("right")) {
						answer += "R";
						currentright = numbers[i];
					} else {
						answer += "L";
						currentleft = numbers[i];
					}
				}
			}
		}
		return answer;
	}

	public static int Distance(int currenthand, int currentnum) {
		int distan = 0;
		int[][] keypad = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int xhandposition = 0;
		int yhandposition = 0;
		int xcurrentnum = 0;
		int ycurrentnum = 0;
		if (currenthand == 0) {
			currenthand = 11;
		}
		if (currentnum == 0) {
			currentnum = 11;
		}
		for (int i = 0; i < keypad.length; i++) {
			for (int j = 0; j < keypad[i].length; j++) {
				if (keypad[i][j] == currenthand) {
					xhandposition = i;
					yhandposition = j;
				}
				if (keypad[i][j] == currentnum) {
					xcurrentnum = i;
					ycurrentnum = j;
				}
			}
		}
		return distan = Math.abs(xcurrentnum - xhandposition) + Math.abs(ycurrentnum - yhandposition);
	}
}
