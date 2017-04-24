package text;
 //***շת�����***
import java.util.Scanner;

public class textSuper04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(),in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
}

class Fraction {
	private int molecular;//����
	private int denominator;//��ĸ
	
	public Fraction(int m,int d) {
		this.molecular = m;
		this.denominator = d;
		int temp = 0;
if(d<m){
			temp = d;
			d = m;
			m = temp;
		}
		while(m!=0) {
			temp = d%m;
			d = m;
			m = temp;
		}
		this.denominator = this.denominator/d;
		this.molecular = this.molecular/d;
	}
	
	public double toDouble() {//������ת��Ϊdouble����
		return (double)molecular/denominator;
	}
	
	public Fraction plus(Fraction t) {//�����������
		int m = 0, d = 0;
		m = molecular*t.denominator + t.molecular*denominator;
		d = denominator * t.denominator;
		int temp = 0;
		if(d<m){
			temp = d;
			d = m;
			m = temp;
		}
		while(m!=0) {
			temp = d%m;
			d = m;
			m = temp;
		}
		return new Fraction((molecular*t.denominator + t.molecular*denominator)/d,(denominator * t.denominator)/d);
	}
	
	public Fraction multiply(Fraction t) {//�����������
		int m = 0, d = 0;
		m = molecular*t.molecular;
		d = denominator * t.denominator;
		if(m == d)
			return new Fraction(1,1);
		return new Fraction(molecular*t.molecular,denominator*t.denominator);
	}
	
	public void print() {//���һ������
		if(molecular == denominator){
			System.out.println(molecular);
		}
		else System.out.println(molecular + "/" + denominator);
	}
}