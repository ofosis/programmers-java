import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N=br.readLine();
		int num=Integer.parseInt(N);
		int result=0;
		for(int i=num-(N.length()*9); i<num; i++) {
			int a=i;
			int sum=0;
			while(a!=0) {
				sum+=a%10;
				a/=10;
			}
			if(sum+i==num) {
				result=i;
				break;
			}
		}System.out.println(result);
	}
}