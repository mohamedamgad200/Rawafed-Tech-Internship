package roafdoop;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	public String getTime() {
		return String.format("%d:%d:%d", hours,minutes,seconds);
	}
	// accessor method
	// getter/ accessor
	public Time() {
		System.out.println("One arg constructor called!");
	}
	public Time(int h) {
		setHour(h);
		System.out.println("One args constructor called!");
	}
	public Time(int h,int m) {
		setHour(h);
		setMinute(m);
		System.out.println("Two args constructor called!");
	}
	public Time(int h,int m,int s) {
		setHour(h);
		setMinute(m);
        setSecond(s);
		System.out.println("Three args constructor called!");
	}
	public int getHour() {
		return this.hours;
	}
	// setter/ mutator
	public void setHour(int hours) {
		if(hours>=0&&hours<=24)
		{
			this.hours=hours;
		}
		else
		{
			System.err.println("Invalid hour value, resetting to Zero!");
			this.hours=0;
		}
		
	}
	public int getMinute() {
		return this.minutes;	
	}
	public void setMinute(int minutes) {
		if(minutes>=0&&minutes<60) {
			this.minutes=minutes;
		}
		else {
			System.err.println("Invalid minute value, resetting to Zero!");
			this.minutes=0;
		}
	}
	public int getSecond() {
		return this.seconds;
	}
	public void setSecond(int seconds) {
		if(seconds>=0&&seconds<60)
		{
			this.seconds=seconds;
		}
		else
		{
			System.err.println("Invalid second value, resetting to Zero!");
			this.seconds=0;
		}
	}
}
