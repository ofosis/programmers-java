import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		int day=Integer.parseInt(st.nextToken());
		int night=Integer.parseInt(st.nextToken());
		int height=Integer.parseInt(st.nextToken());
		int time=(height-day)/(day-night)+1;
		if((height-day)%(day-night)!=0) {
			time++;
		}
		sb.append(time);
		System.out.println(sb);
	}
}