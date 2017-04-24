package text;
import java.util.Scanner;
public class zh {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min,hour;
		
		in = new Scanner(System.in);
		int BJT = in.nextInt();
		hour = BJT/100;
		min = BJT%100;
		if(BJT < 0 || BJT > 2359|| min > 59)
			System.exit(0);
		if(hour >= 8)
			hour = hour - 8;
		else
			hour = hour+24-8;
		
		if(min > 0)
			System.out.println(hour*100+min);
		else
			System.out.println(hour*100);
		}
}
