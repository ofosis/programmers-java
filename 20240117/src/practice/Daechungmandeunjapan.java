package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Daechungmandeunjapan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Daechungmandeunjapan solution = new Daechungmandeunjapan();
		String[] a = new String[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next();
		}
		sc.nextLine();
		String[] b = new String[sc.nextInt()];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.next();
		}
//		      String[][] bb = new String[sc.nextInt()][sc.nextInt()];
//		      for (int i = 0; i < bb.length; i++) {
//		         for (int j = 0; j < bb[i].length; j++) {
//		            bb[i][j] = sc.next();
//		         }
//		      }
		int[] result = solution.solution(a, b);
		System.out.println(Arrays.toString(result));
	}

	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		for (int i = 0; i < targets.length; i++) {
			for (int k = 0; k < targets[i].length(); k++) {
				if(answer[i]==-1) {
					break;
				}
				int min = Integer.MAX_VALUE;
				int[] point = new int[targets[i].length()];
				char word = targets[i].charAt(k);
				for (int j = 0; j < keymap.length; j++) {
					if (keymap[j].contains(String.valueOf(word)) && keymap[j].indexOf(word) + 1 < min) {
						min = keymap[j].indexOf(word) + 1;

					}
					if (j == keymap.length - 1) {
						if (min != Integer.MAX_VALUE) {
							answer[i] += min;
						}
						else {
							answer[i]=-1;
						}
					}

				}
			}
		}
		return answer;
	}
}
