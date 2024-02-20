import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] num = new int[Integer.parseInt(br.readLine())][2];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num[i][0] = Integer.parseInt(st.nextToken());
			num[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num, (e1, e2) -> {
			if (e1[0] == e2[0]) return e1[1] - e2[1];
			else return e1[0] - e2[0];
		});
		for (int i = 0; i < num.length; i++) {
			sb.append(num[i][0]+" ");
			sb.append(num[i][1]+"\n");
		}
		System.out.println(sb);
	}
}