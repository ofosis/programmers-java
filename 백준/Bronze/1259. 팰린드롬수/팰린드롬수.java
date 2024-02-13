import java.util.Scanner;

public class Main {
    
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String num = sc.nextLine();
            if (num.equals("0")) {
                break;
            }
            
            if (isPalindrome(num)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
        sc.close();
    }
}
