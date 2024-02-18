import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine();
		int sum=0;
		for(int i=0; i<word.length(); i++) {
			int num=word.charAt(i);
			if(num==83||num==86||num>=89) {
				sum+=((num-65)/3)+2;
			}else {
				sum+=((num-65)/3)+3;
			}
		}System.out.println(sum);
	}
}
