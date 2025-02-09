package roafdlec1;

public class ArrayTask2 {

	public static void main(String[] args) {
		//String[] colors = {"white", "blue", "black", "yellow", "red", "brown", "green"};
		//for(String color : colors)
		//{ 
		//System.out.printf("%-8s",color );
		//for(int i=0;i<color.length();i++) {
//			System.out.print("*");
		//}
		//System.out.println();
		//}
		int[] grades = {1,6,3,5,8,9,2,10,4,3,5,7,8,9,10,3,1,5,7,8,5,3,4,8,2,7,9,8,7,0};
		int[] arr=new int[11];
		for(int grade:grades) {
			arr[grade]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("grade "+i+"  = "+arr[i]);
		}
	}
}
