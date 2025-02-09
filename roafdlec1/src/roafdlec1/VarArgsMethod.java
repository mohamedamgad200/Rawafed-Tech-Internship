package roafdlec1;

public class VarArgsMethod {

	public static void main(String[] args) {
		max();
		System.out.println("**********");
		max(1);
		System.out.println("**********");
		max(2,5);
		System.out.println("**********");
		max(2,3,5);
		System.out.println("**********");
		max(6,2,1,5);
		System.out.println("**********");
		max(6,7,8,9,7);
		System.out.println("**********");
		System.out.printf("name is ali");
		System.out.printf("name:%s","ali");
		System.out.printf("name %s ,age %d","ali",28);

	}
	static int max(int ...params) {
		for(int i=0;i<params.length;i++) {
			System.out.println(params[i]);
		}
		return 0;
	}
	static void m1(String s,int...params) {};
	//static void m2(String s,int...p,double...d) {};

}
