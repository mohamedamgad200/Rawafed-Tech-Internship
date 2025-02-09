package roafdlec1;

public class MutiArray {

	public static void main(String[] args) {
		int[][] grades= {
				{18,20,19,16},
				{5,7},
				{18,19,19},
				{16,17,19,15}
		};
		int [][]grades2=new int [4][4];
		for(int i=0;i<grades.length;i++) {
		    for(int j=0;j<grades[i].length;j++) {
		    System.out.printf("%5d",grades[i][j]);	
		    }
		    System.out.println();
		}
		System.out.println("***********************");
		for(int []studentsGrade:grades) {
			for(int grade:studentsGrade) {
				System.out.printf("%5d",grade);	
		}
			System.out.println();
		}
		System.out.println("***********************");
	}

}
