import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H=Integer.parseInt(st.nextToken());
			int W=Integer.parseInt(st.nextToken());
			int customer=Integer.parseInt(st.nextToken());
			int room;
			int no;
			if(customer%H==0) {
				room=H;
				no=customer/H;
			}
			else {
				room=customer%H;
				no=customer/H+1;
			}	
			System.out.println(room*100+no);
		}
	}
}
