import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
        String[] a=new String[sc.nextInt()];
        sc.nextLine();
        for(int i=0; i<a.length; i++) {
        	a[i]=sc.nextLine();
        }
        for(int i=0; i<a.length; i++) {
        	sb.delete(0, sb.length());
        	int count=a[i].charAt(0)-'0';
        	for(int j=2; j<a[i].length(); j++) {
        		sb.append(String.valueOf(a[i].charAt(j)).repeat(count));
        	}
        	System.out.println(sb);
        }
	}
}
