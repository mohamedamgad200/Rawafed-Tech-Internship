package roafdoop;

public class oopintro {

	public static void main(String[] args) {
		Player p1=new Player();
		p1.num=10;
		p1.name="Bebo";
		p1.ball=true;
		System.out.printf("Player name=%s , num=%d ,ball=%b%n",p1.name,p1.num,p1.ball);
       p1.Kick();
       p1.run();
	}

}
