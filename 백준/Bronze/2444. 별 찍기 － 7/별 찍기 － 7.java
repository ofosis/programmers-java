import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int a=0;
		for(int i=1; i<=num; i++) {
			System.out.print(" ".repeat(num-i));
			System.out.println("*".repeat(i+a));
			if(i==num) {
				for(int j=1; j<num; j++) {
					a--;
					System.out.print(" ".repeat(j));
					System.out.println("*".repeat(i+a-j));
				}
			}
			a++;
		}
	}
}
