package defaultg;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Solution solution = new Solution();
//      String[] a = new String[sc.nextInt()];
//      for (int i = 0; i < a.length; i++) {
//         a[i] = sc.next();
//      }
//      int[] b = new int[6];
//      for (int i = 0; i < b.length; i++) {
//         b[i] = sc.nextInt();
//      }
//      String[][] bb = new String[sc.nextInt()][sc.nextInt()];
//      for (int i = 0; i < bb.length; i++) {
//         for (int j = 0; j < bb[i].length; j++) {
//            bb[i][j] = sc.next();
//         }
//      }
      int result = solution.solution(sc.nextLine());
      System.out.println(result);
   }
//프로그래머스 lv1 문자열 나누기 문제
   public int solution(String s) {
      int answer = 0;
      while (s.length() > 0) {
         char a = s.charAt(0);
         int counta = 1;
         int countb = 0;
         for (int i = 1; i < s.length(); i++) {
            if (a == s.charAt(i)) {
               counta++;
            }
             else {
               countb++;
            }
            if (counta == countb) {
               break;
            }
         }
         s = s.substring(counta + countb);
         answer++;
      }
      return answer;
   }
}