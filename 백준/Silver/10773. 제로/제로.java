import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] ar = new int[Integer.parseInt(st.nextToken())];
		long sum = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = Integer.parseInt(br.readLine());
			if (ar[i] == 0) {
				int temp = i;
				while (true) {
					if (ar[temp - 1] != 0) {
						sum -= ar[temp - 1];
						ar[temp-1]=0;
						break;
					}else {
						temp--;
					}
				}
				continue;
			}else {
				sum += ar[i];
			}
		}
		System.out.println(sum);
	}
}
