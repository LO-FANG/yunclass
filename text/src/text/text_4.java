package text;
import java.util.Scanner;

public class text_4 {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		int n = in.nextInt();
		int i, k = 0, key = 1;
		double j = 0;
		String str = new String();
		str = Integer.toString(n);
		i = str.length();
		char a[] = str.toCharArray();
		
		for(i = a.length-1;i >=0;i--,key++){
			if((key+a[i])%2 == 0){
				j = Math.pow(2, key-1);
				k+=j;
			}
		}
		System.out.print(k);
	}

}
