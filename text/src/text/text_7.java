package text;

import java.util.Scanner;  

public class text_7 {  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);  
        int[][] num = new int[2][120];  
        int i,j,size,New,max=0,tag=0;   
        for(i=0;i<2;i++){//输入两个多项式  
            size = in.nextInt();//第一项为最高项                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
            if(max<size)  
                max=size;  
              
            num[i][size]=in.nextInt();
            if(size==0)//第一项为0，直接输入下一个多项式  
                continue; 
            do {//输入直到最终为0项  
                New = in.nextInt();
                num[i][New]+=in.nextInt();
            } while (New!=0);  //系数为零不会输入,所以new != 0 用来判断幂次数。
        }  
        /* ****输出**** */  
        
        
        //(num[0][i]+num[1][i])为系数 ，i为指数             我选择所有符号数字分开输出的办法              *****注注注*****
        
        
        
        for(i=max;i>=0;i--){  
            if(max==0)//只有常数项，输出，结束  
                {System.out.print((num[0][i]+num[1][i]));break;}  
            if((num[0][i]+num[1][i])!=0){//系数不为0                      正负相加为零的情况
                if(tag==1)//tag为符号位置，tag为0 即 这是第一项，不考虑+号
                    if((num[0][i]+num[1][i])>=0)//非第一项 输出加号 
                        System.out.print("+");  
                if((num[0][i]+num[1][i])!=1||i==0)//输出系数，系数为1，不输出，但是常数项的1输出  
                    System.out.print(num[0][i]+num[1][i]);  
                if(i!=0)//不为常数项，输出x  
                    System.out.print("x");  
                if(i!=0&&i!=1)//不为常数项和x的一次方，输出次数  
                    System.out.print(i);  
                tag=1;//有过一次输出，即 可以输出符号  
            }  
            if(tag==0&&i==0&&(num[0][i]+num[1][i])==0)//如果 只有一项常数项 且常数项为0 单独处理  
                System.out.print((num[0][i]+num[1][i]));  
                  
        }  
        System.out.println();  
        }  
}  