import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] arr = new String[N];
		String[] Wboard = new String[8];
		String[] Bboard = new String[8];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i = 0; i < 8; i++) {
			if(i % 2 == 0) Wboard[i] = "WBWBWBWB";
			else Wboard[i] = "BWBWBWBW";
		}
		
		for(int i = 0; i < 8; i++) {
			if(i % 2 == 0) Bboard[i] = "BWBWBWBW";
			else Bboard[i] = "WBWBWBWB";
		}
		
		int min = 64;
		
		for(int i = 0; i < (N - 7); i++) {
			for(int j = 0; j < (M - 7); j++) {
				int Wcount = 0;
				int Bcount = 0;
				for(int k = 0; k < 8; k++) {
					for(int l = 0; l < 8; l++) {
						if(Wboard[k].charAt(l) != arr[k + i].charAt(l + j)) Wcount++;
						if(Bboard[k].charAt(l) != arr[k + i].charAt(l + j)) Bcount++;
					}
				}
				min = Math.min(min, Math.min(Wcount, Bcount));
			}
		}
		System.out.println(min);
	}

}