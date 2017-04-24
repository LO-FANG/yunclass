package text;
import java.util.Scanner;
public class text_3 {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int a = in.nextInt();
		while(a != -1){
			
			if(a%2 == 0){
				i++;
			}
			else if(a%2 != 0){
				j++;
			}
			a = in.nextInt();
		}
		System.out.println(j+" "+i);
	}
}
