import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		String num=sc.next();
		int sum=0;
		for(int i=0; i<count; i++) {
			sum+=num.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
