import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String[] aa=br.readLine().split(" ");
			int[] num=new int[3];
			for(int i=0; i<aa.length; i++) {
				num[i]=Integer.parseInt(aa[i]);
			}
			if(num[0]==0&&num[1]==0&&num[2]==0) {
				break;
			}
			Arrays.sort(num);
			int sum=num[0]*num[0]+num[1]*num[1];
			if(sum==num[2]*num[2]) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}
}
