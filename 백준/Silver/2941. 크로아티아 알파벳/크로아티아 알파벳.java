import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] alp= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String word=br.readLine();
		int sum=0;
		for(int i=0; i<alp.length; i++) {
			while(true) {
				if(word.contains(alp[i])) {
					sum+=1;
					word=word.replaceFirst(alp[i], " ");
				}else {
					break;
				}
			}
		}
		word=word.replace("-", "").replace("=", "").replace(" ", "");
		System.out.println(sum+word.length());
	}
}
