package Exception;

public class Except1 {

	public static void main(String[] args) {
		int i=12;
		int j=0;
		Except1 obj=new Except1();
		try {
			int result=obj.divide(i,j);
			System.out.println(result);
		}catch(Exception ex)
		{
			System.out.println("Cannot divide by zero");
		}

	}
	public int divide(int x,int y) throws Exception {
	if (y==0)
	{
		throw new Exception();
	}
	int z= x/y;
	return z;
	}

}
