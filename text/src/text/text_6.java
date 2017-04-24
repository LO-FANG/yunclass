package text;
import java.util.Scanner;
public class text_6 {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		
		int j, i = in.nextInt();
		if(i < 0)       		//判断是否为负数的情况
		{
			System.out.print("fu ");  //将负号输出
			j = -i;					
		}else
			j = i;
		int mark = 1;
		int key = j;
		while(key > 9)     //判断位数,得到mark
		{
			key/=10;
			mark*=10;
		}
		do
		{
			int d = j/mark;				//通过mark得到最大位上的数值。
			switch(d)
			{
			case 0:System.out.print("ling");break;  
	        case 1:System.out.print("yi");break;  
	        case 2:System.out.print("er");break;  
	        case 3:System.out.print("san");break;  
	        case 4:System.out.print("si");break;  
	        case 5:System.out.print("wu");break;  
	        case 6:System.out.print("liu");break;  
	        case 7:System.out.print("qi");break;  
	        case 8:System.out.print("ba");break;  
	        case 9:System.out.print("jiu");break;
			}
			if(mark > 9)				//判断是否为个位数字，如为个位数则末尾不需要空格
			{
				System.out.print(" ");
			}
			j%=mark;					//从倒数第二位位数上开始获得数值
			mark/=10;						
		}while(mark > 0);				//判断是否获得全部位数上的数值
		}
	}
	

