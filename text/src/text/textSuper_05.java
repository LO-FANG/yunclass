package text;

public class textSuper_05 {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(),in.nextInt(),in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
}

class Clock {
	Display hh = new Display(24);
	Display mm = new Display(60);
	Display ss = new Display(60);
	public Clock(int h, int m,int s) {
		this.hh.setValue(h);
		this.mm.setValue(m);
		this.ss.setValue(s);
	}
	
	public void tick() {
		ss.increase();
		if(ss.getValue() == 0) {
			mm.increase();
			if(mm.getValue() == 0){
				hh.increase();
			}
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d",hh.getValue(),mm.getValue(),ss.getValue());
	}
}

class Display {
	private int value,limit;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if(value >= limit) {
			value = 0;
		}
	}
}