import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num=new int[n];
		int count=0;
		for(int i=0; i<n; i++) {
			num[i]=Integer.parseInt(st.nextToken());
			if(primenum(num[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean primenum(int a) {
		if(a==1) {
			return false;
		}
		for(int i=2; i<=(int)Math.sqrt(a); i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}