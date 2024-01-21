package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Dulmanamho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dulmanamho solution = new Dulmanamho();
//		String[] a = new String[sc.nextInt()];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = sc.next();
//		}
//		sc.nextLine();
//		String[] b = new String[sc.nextInt()];
//		for (int i = 0; i < b.length; i++) {
//			b[i] = sc.next();
//		}
//		      String[][] bb = new String[sc.nextInt()][sc.nextInt()];
//		      for (int i = 0; i < bb.length; i++) {
//		         for (int j = 0; j < bb[i].length; j++) {
//		            bb[i][j] = sc.next();
//		         }
//		      }
		String result = solution.solution(sc.nextLine(),sc.nextLine(),sc.nextInt());
		System.out.println(result);
	}

	public String solution(String s, String skip, int index) {
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			int count=0;
			String what="";
			char word=s.charAt(i);
			while(count<index) {
				word=(char)((word+1-'a')%26 +'a');
				if(skip.contains(String.valueOf(word))) {
					continue;
				}
				count++;
				what=String.valueOf(word);
			}
			answer+=what;
		}
		return answer;
	}
}
