import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = new String[sc.nextInt()];
		sc.nextLine();
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLine();
		}
		for (int i = 0; i < a.length; i++) {
			int score=0;
			int count=0;
			for (int j = 0; j < a[i].length(); j++) {
				if (a[i].charAt(j) == 'O') {
					count += 1;
					score += count;
				}
				else {
					count=0;
				}
			}
			System.out.println(score);
		}
	}
}
