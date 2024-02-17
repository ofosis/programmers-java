import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result="1";
		String word=br.readLine();
		for(int i=0; i<word.length()/2; i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i)) {
				result="0";
				break;
			}
		}System.out.println(result);
	}
}
