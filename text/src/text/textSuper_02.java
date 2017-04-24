package text;

import java.util.Scanner;
public class textSuper_02{
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count=0;
		boolean key = true;
		in = new Scanner(System.in);
		String s = in.nextLine();
		char[] a = null;
		a = s.toCharArray();
		for(i=0;i<a.length;i++){
			if(a[i]!=' '){
				count++;
			}

			if(a[i]=='.'&&count!=1){
				if(key){
				System.out.print(count-1);
				key =false;
				}else{
					System.out.print(" "+(count-1));
				}
			}
			if(a[i]==' '&& a[i+1]!=' '){
				if(key && count != 0){
					System.out.print(count);
					key = false;
					count = 0;
					}if(!key&& count!=0){
						System.out.print(" "+count);
					}
				count=0;
			}
		}
	}

}