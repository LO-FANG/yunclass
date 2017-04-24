package text;
import java.util.Scanner;
public class text_2 {
	private static Scanner in; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"unreadable","barely readable, occasional words distinguishable","readable with considerable difficulty",
				"readable with practically no difficulty","perfectly readable"};
		in = new Scanner(System.in);
		String[] b = {"Faint signals, barely perceptible",
				 	  "Very weak signals",
					  "Weak signals",
					  "Fair signals",
					  "Fairly good signals",
					  "Good signals",
					  "Moderately strong signals",
					  "Strong signals",
					  "Extremely strong signals"};
		System.out.println("请输入一个0~100内的数字:");
		int key = in.nextInt();
		if(key < 0 || key > 99){
			System.exit(0);
		}
		int i = key/10;
		int j = key%10;
		
		for(int y = 0;y < b.length;y++){
			if(j-1 == y)
				System.out.print(b[y]+",");
		}
		
		for(int k = 0; k < a.length; k++)
			if(i-1 == k)
				System.out.print(a[k]);
	}

}
