package defaultg;

import java.util.Arrays;
import java.util.Scanner;

public class Secondsolu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Secondsolu solution = new Secondsolu();
		int[] a = new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[sc.nextInt()];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		int result = solution.solution(sc.nextInt(), a, b);
		System.out.println(result);
	}

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] clo = new int[n + 1];
		Arrays.fill(clo, 1);
		for (int j = 0; j < lost.length; j++) {
			clo[lost[j]] = 0;
		}
		for (int k = 0; k < reserve.length; k++) {
			if (clo[reserve[k]] == 0) {
				clo[reserve[k]]++;
				continue;
			}
			clo[reserve[k]] = 2;
		}
		for (int i = 1; i < clo.length; i++) {
			if (clo[i] == 0) {
				if (i > 1 && clo[i - 1] > 1) {
					clo[i - 1]--;
					clo[i]++;
				} else if (i < n && clo[i + 1] > 1) {
					clo[i + 1]--;
					clo[i]++;
				}
			}
		}
		for (int i = 1; i < clo.length; i++) {
			if (clo[i] > 0) {
				answer++;
			}
		}
		return answer;
	}
}
