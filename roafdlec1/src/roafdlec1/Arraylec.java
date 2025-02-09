package roafdlec1;

public class Arraylec {

	public static void main(String[] args) {
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=((i*2)+10);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
