import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] word=new String[sc.nextInt()];
		sc.nextLine();
		for(int i=0; i<word.length; i++) {
			word[i]=sc.nextLine();
		}
		Arrays.sort(word,(String s1, String s2)->s1.length() - s2.length());
		for (int i = 0; i < word.length; i++) {
            int j;
            for (j = i+1; j < word.length; j++) {
                if(word[i].length() != word[j].length()) break;
            }
            Arrays.sort(word, i,j);
            i = j-1;
        }
		System.out.println(word[0]);

        for (int i = 1; i < word.length; i++) {
            if(word[i-1].equals(word[i])) continue;
            
            System.out.println(word[i]);
        }
	}
}
