package practice;

import java.util.Arrays;
import java.util.Scanner;

public class wanjoohajimothansunsoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		wanjoohajimothansunsoo solution = new wanjoohajimothansunsoo();
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
		String result = solution.solution(a, b);
		System.out.println(result);
	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		int count = 0;
		for (int i = 0; i < participant.length; i++) {
			if (i == participant.length - 1) {
				return participant[i];
			}
			if (!participant[i].equals(completion[count])) {
				return participant[i];
			}
			count++;
		}
		return answer;
	}
}
