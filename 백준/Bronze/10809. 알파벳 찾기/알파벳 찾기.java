import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] alpha=new int[26];
		String a=sc.nextLine();
		Arrays.fill(alpha,-1);
		for(int i=0; i<a.length(); i++) {
			alpha[a.charAt(i)-'a']=a.indexOf(a.charAt(i));
		}
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i]+" ");
		}
	}
}
