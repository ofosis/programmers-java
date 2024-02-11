import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        int max=Integer.MIN_VALUE;
        int alpha=0;
        int[] aa=new int[26];
        for(int i=0; i<a.length(); i++) {
        	aa[a.charAt(i)-'a']+=1;
        }
        for(int i=0; i<aa.length; i++) {
        	if(aa[i]>max) {
        		max=aa[i];
        		alpha=i;
        	}
        	if(i==aa.length-1) {
        		for(int j=0; j<aa.length; j++) {
        			if(j!=alpha&&aa[j]==max) {
        				System.out.println("?");
        				break;
        			}
        			else {
        				if(j==aa.length-1)
        				System.out.println((char)(alpha+65));	
        			}
        		}	     
        	}
        }
	}
}
