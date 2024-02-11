import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        int b=0;
        for(int i=0; i<a.length(); i+=2) {
        	b+=(int)Math.pow(a.charAt(i)-'0',2);
        } 
        System.out.println(b%=10);
	}
}