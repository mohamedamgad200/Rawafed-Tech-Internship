package roafdoop;

public class TimeTest {

	public static void main(String[] args) {

//		Time t1 = new Time();
//		
//		System.out.printf("%d:%d:%d%n", 
//				t1.getHour(), t1.getMinute(), t1.getSecond());
//		
//		t1.setHour(20);
//		t1.setMinute(15);
//		t1.setSecond(30);
//		
//		System.out.println(t1.getTime());
//		
//		t1.setHour(35);
//		t1.setMinute(78);
//		t1.setSecond(60);
//		
//		System.out.println(t1.getTime());
		Time t0 = new Time();
		System.out.println("*******");
		Time t1 = new Time(12);
		System.out.println("*******");
		Time t2 = new Time(16, 30);
		System.out.println("*******");
		Time t3 = new Time(10, 20, 50);
		System.out.println("*******");
		
		System.out.println("t0 = " + t0.getTime());
		System.out.println("t1 = " + t1.getTime());
		System.out.println("t2 = " + t2.getTime());
		System.out.println("t3 = " + t3.getTime());
		
		// goblin of OOP
		// this.__
		// __.this
		// this( calling constructor in same class
		
		// super.__

	}

}
