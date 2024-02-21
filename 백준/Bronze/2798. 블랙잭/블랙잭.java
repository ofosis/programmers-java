import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] op = new int[Integer.parseInt(st.nextToken())];
		int max=Integer.parseInt(st.nextToken());
		int sum=0;
		int result=0;
		st=new StringTokenizer(br.readLine());
		for (int i = 0; i < op.length; i++) {
			op[i]= Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < op.length - 2; i++)
		{
			for(int j = i+1; j < op.length -1; j++)
			{
				for (int k = j+1; k < op.length; k++)
					{
					sum = op[i]+op[j]+op[k];
					
					if (max == sum) {
						result = sum;
						break;
					}
					
					if (sum < max && result < sum)
					result = sum;
					}
			}
		}System.out.println(result);
	}
}