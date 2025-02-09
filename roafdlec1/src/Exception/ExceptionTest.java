package Exception;

public class ExceptionTest {

	public static void main(String[] args) throws MyException3{
		// TODO Auto-generated method stub
      try{
    	  m1();
      }catch(MyException1 e) {
    	  e.printStackTrace();
      }
	}
  static void m1() throws MyException1,MyException3 {
	  try {
		  m2();
			
			m4();
			
			m5();
	  }catch(MyException2 ex) {
		  
	  }catch (MyException1 ex) {
			System.out.println("exception");
			throw ex;
		} finally {
			
		}
	  try {
			m2();
			m4();
			m5();
		} catch (MyException1 | MyException3 ex) {
			
		}
		
  }
  static void m2()throws MyException1,MyException4 {
	  m3();
	  throw new MyException4();
  }
  static void m3() throws MyException1{
	  throw new MyException1();
  }
  static void m4() throws MyException2 {
	  throw new MyException2();
  }
  static void m5()throws MyException3 {
	  throw new MyException3();
  }
}
