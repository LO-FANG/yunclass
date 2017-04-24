package text;
import java.util.Scanner;
public class text_10 {
	private static Scanner in; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		int n = in.nextInt();
		boolean key = false;
		key = sushu(n);
		if( key==true ){
			System.out.print(n+"="+n);
		}else{
			System.out.print(n+"=");
			fenjie(n);
		}
	}
	
	public static boolean sushu(int x){//静态方法无法调用动态方法
		int i;
		for( i=2 ; i<x; i++ ){
			if( x%i==0 )
				return false;
		}
		return true;
	}
	
	public static void fenjie(int x){
		int j = 0;
		for(int i=2; i <= x; i++){
			for(j=2;j<=i;j++){
				if(i%j==0)
				break;
			}
			if(x%i==0 && i==j){
				while(x%i==0){
					x/=i;
					if(x%i==x)
						System.out.print(i);
					else
						System.out.print(i+"x");
				}
			}
		}
	}

}
