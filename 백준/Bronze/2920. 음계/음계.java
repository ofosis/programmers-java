import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String song = sc.nextLine();
		int[] arr = new int[8];
		for (int i = 0; i < song.length(); i += 2) {
			arr[i / 2] = song.charAt(i) - '0';
		}
		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(arr[i] - arr[i - 1]) != 1) {
				System.out.println("mixed");
				break;
			} else {
				if (i == arr.length - 1) {
					if (arr[i] > arr[i - 1]) {
						System.out.println("ascending");
					} else {
						System.out.println("descending");
					}
				}
			}
		}
	}
}
