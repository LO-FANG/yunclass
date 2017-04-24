package text;
import java.util.Scanner;
public class text_8 {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfX = 0;
		int numOfO = 0;
		boolean getResult = false;
		in = new Scanner(System.in);
		int size = in.nextInt();
		if(size < 3){
			System.exit(0);
		}
		int[][] a = new int[size][size];
		for(int i = 0;i <a.length;i++){
			for(int j = 0; j < a[i].length;j++){
				a[i][j] = in.nextInt();
			}
		}
		//**检测行**
		for( int i=0; i<size; i++ ){
			numOfX = 0;
			numOfO = 0;
			for( int j=0; j<size; j++ ){
			if( a[i][j] == 1 ){
				numOfX++;
				}else{
					numOfO++;
				}
			}
			if( numOfO == size || numOfX == size ){
				getResult = true;
				break;
			}
		}
		
		
		//**检测列**
				for( int i=0; i<size; i++ ){
					numOfX = 0;
					numOfO = 0;
					for( int j=0; j<size; j++ ){
					if( a[j][i] == 1 ){
						numOfX++;
						}else{
							numOfO++;
						}
					}
					if( numOfO == size || numOfX == size ){
						getResult = true;
						break;
					}
				}
				if( getResult && numOfX == size ){
					System.out.print("X");
				}
				if( getResult && numOfO == size ){
					System.out.print("O");
				}
				
				//**检测对角线**
				numOfX = 0;
				numOfO = 0;
				for(int i=0; i<size; i++ ){
					if(a[i][i] == 1){
						numOfX++;
					}else{
						numOfO++;
					}
				}
				if(numOfO == size || numOfX == size){
					getResult = true;
				}
				if( getResult && numOfX == size ){
					System.out.print("X");
				}
				if( getResult && numOfO == size ){
					System.out.print("O");
				}
		
				
				//**检测反对角线**
				numOfX = 0;
				numOfO = 0;
				for( int i=0; i<size; i++ ){
					for( int j=0; j<size; j++ ){
						if((i+j) == size-1 && a[i][j] == 1){
							numOfX++;
						}
						else if((i+j)==size-1 && a[i][j] == 0){
							numOfO++;
						}
					}
				}
				if(numOfO == size || numOfX == size){
					getResult = true;
				}
				
		if(getResult){
			if(numOfX == size){
				System.out.print("X");
			}
			if(numOfX == size){
				System.out.print("O");
			}
		}
		if(!getResult){
			System.out.print("NIL");
		}
	}
}

