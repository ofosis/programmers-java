import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] num=new int[N];
		for(int i=0; i<num.length; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			num[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		for(int i=0; i<num.length; i++) {
			sb.append(num[i]+"\n");
		}
		System.out.println(sb);
	}
}