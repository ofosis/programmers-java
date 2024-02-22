import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] num = new String[Integer.parseInt(br.readLine())][2];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num[i][0] = st.nextToken();
			num[i][1] = st.nextToken();
		}
		Arrays.sort(num, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
			}
			
		});

		for (int i = 0; i < num.length; i++) {
			sb.append(num[i][0]+" ");
			sb.append(num[i][1]+"\n");
		}
		System.out.println(sb);
	}
}