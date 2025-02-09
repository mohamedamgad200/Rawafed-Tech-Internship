package roafdlec1;

import java.util.Scanner;

public class Main {

	public static void main(String [] arr) {
		int studentsCount=5;
		Scanner input=new Scanner(System.in);
		int counter=1;
		int sum=0;
		int avg;
		int min=0,max=0;
		while(counter<=studentsCount) {
			System.out.print("Enter grade #"+counter+": ");
			int grade=input.nextInt();
			System.out.println("You have earned "+grade);
			sum+=grade;
			counter++;
		}
		avg=sum/studentsCount;
		System.out.println();
		System.out.println("Grade sum : "+sum +", Grades average: "+avg);
		
		//loops 
		//for
		//while
		//do while
		//iterators
		//enhanced for (for each)
		
		//counter integer
		//1- initial value 
		//2-ending value
		//3- step
//		int value=5;
//		System.out.println(value);
//		System.out.println(value++);
//		System.out.println(++value);
//		System.out.println(value);
		
		
		/*
		 * 1 2 3 
		 * 4 5 6
		 * 7 8 9
		 */
		//O(n)
//		for(int i=1;i<=9;i++) 
//		{
//			System.out.print(i+ " ");
//			if(i%3==0) {
//				System.out.println();
//			}
//		}
		//O(n2)
//		for(int i=1;i<=9;i++) 
//		{
//			System.out.print(i+ " ");
//			for(int j=3; i%j==0 ;j=j+1) {
//			System.out.println();	
//			}
//		}
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		/*
		int grade=75;
		if(grade>=85) {
			System.out.println("Excellent");
		}
		else if(grade>=75) {
			System.out.println("Very Good");
		}
		else if(grade>=65) {
			System.out.println("Good");
		}
		else if(grade>=50) {
			System.out.println("Acceptance");
		}
		else {
			System.out.println("Failed");
		}
		*/
		/*
		int grade=6;
		System.out.println("---Using if ---");
		if(grade==0) {
			System.out.println("Failed");
		}
		else if(grade==1) {
			System.out.println("Acceptance");
		}
		else if(grade==2) {
			System.out.println("Good");
		}
		else if(grade==3) {
			System.out.println("Very Good");
		}
		else if(grade==4||grade==5) {
			System.out.println("Excellent");
		}
		else {
			System.out.println("UNKOWN GRADE");
		}
		System.out.println("---Using switch ---");
		switch(grade) {
		case 0:
		    System.out.println("Failed");
		    break;
		case 1:
			System.out.println("Acceptance");
			break;
		case 2:
			System.out.println("Good");
		    break;
		case 3:
			System.out.println("Very Good");
		    break;
		case 4:
		case 5:
			System.out.println("Excellent");
		    break;
		default:
			System.out.println("UNKOWN GRADE");
		}
		System.out.println("---Finish program ---");
	}
	*/
//		int grade=75;
//		String result=grade>=85?"Excellent":grade>=75?"Very Good":grade>=65?"Good":grade>=50?"Acceptance":"Failed";
//		System.out.println(result);
  }
}
