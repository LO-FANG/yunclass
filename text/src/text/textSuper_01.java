package text;
import java.util.Scanner;
public class textSuper_01 {
	private static Scanner in; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[20];
		in = new Scanner(System.in);
		int min = in.nextInt();
		int max = in.nextInt();
		wanshu(min,max);
	}
	
	public static void wanshu(int x, int y){
		int i, j=0;
		boolean key = false;
		boolean key1 = true;
		for( i=x; i<=y; i++ ){
			int k=0;
			for( j=1; j<i; j++ ){
				if( i%j==0 ){
					k+=j;
				}
			}
			if(k==i){
				if(key1){
					System.out.print(i);
					key1 = false;
				}else{
					System.out.print(" "+i);
				}
				key = true;
			}
		}
		if(key == false){
			System.out.print("NIL");
		}
	}
}
