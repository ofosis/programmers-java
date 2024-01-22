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
//		int[][] bb = new int[sc.nextInt()][sc.nextInt()];
//		for (int i = 0; i < bb.length; i++) {
//			for (int j = 0; j < bb[i].length; j++) {
//				bb[i][j] = sc.nextInt();
//			}
//		}
		int result = solution.solution(a);
		System.out.println(result);
	}

	public int solution(int[] ingredient) {
		int answer = 0;
		StringBuilder ham=new StringBuilder();
		for(int i=0; i<ingredient.length; i++) {
			ham.append(ingredient[i]);
			if(ham.length()>3&&ham.substring(ham.length()-4, ham.length()).equals("1231")) {
				ham.delete(ham.length()-4, ham.length());
				answer+=1;
			}
		}
	
		return answer;
	}
}
