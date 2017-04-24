package text;
import java.util.Scanner;

public class text_5 {
	private static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();

        if (n <= 0 || m <= 0 || n > m || m > 200 || n > 200) {
            System.exit(0);
        }
        int sum = 0;
        int count = 0;
        for (int i = 2 ; i <= 1000000 ; i ++) {
            if (isPrime(i)) {
                count ++;
                if (count >=n && count <= m) {
                    sum += i;
                }
                if (count == m) {
                    break;
                }
            }
        }
        System.out.print(sum);

    }

    static boolean isPrime(int n) {
        int m = (int)Math.sqrt(n);
        for (int j = 2; j <= m; j++) {
            if (n % j == 0) {
                return  false;
            }
        }
        return true;
    }
}
