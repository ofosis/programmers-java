import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			int H=sc.nextInt();
			int W=sc.nextInt();
			int customer=sc.nextInt();
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
