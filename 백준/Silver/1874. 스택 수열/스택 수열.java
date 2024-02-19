import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> sk = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int[] num = new int[Integer.parseInt(br.readLine())];
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if (max < num[i]) {
				max = num[i];
			}
		}
		int temp = 0;
		for (int i = 1; i <= max; i++) {
			sk.push(i);
			sb.append("+" + "\n");
			if (temp < max && sk.peek() == num[temp]) {
				int b = temp;
				while (true) {
					if (!sk.isEmpty() && sk.peek() == num[b]) {
						sk.pop();
						b++;
						sb.append("-" + "\n");
					}
					 else {
						temp = b;
						break;
					}
				}
			}if(i==max&&!sk.isEmpty()) {
				sb.delete(0, sb.length());
				sb.append("NO");
				break;
			}
		}
		System.out.println(sb);
	}
}
