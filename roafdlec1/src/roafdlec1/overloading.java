package roafdlec1;

public class overloading {

	public static void main(String[] args) {
		int num1=9;
		int num2=8;
		int num3=7;
	int max=max(num1,num2);
	}
	static int max(int x,int y)
	{
		if(x>y)return x;
		return y;
	}
	static int max(int x,int y,int z)
	{
		if(x>y&&x>z)return x;
		if(y>x&&y>z)return x;
		return z;
	}
	//type of parameter
	//order of parameters
	//count of parameter
void m1(int x) {}//successful overload
void m1(int x,int y) {}//successful overload
void m1(String s,String t) {}//successful overload
void m1(String s,int i) {}//successful overload
void m1(int  i,String m) {}//successful overload
//int m1 (int x){return 0};//unsuccessful overload
}
