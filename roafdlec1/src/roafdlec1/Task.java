package roafdlec1;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		int studentsCount=10;
		boolean flag=true;
		Scanner input=new Scanner(System.in);
		int counter=1;
		int sum=0;
		float avg;
		int min=0,max=0;
		//With break
		//While with break
		while(counter<=studentsCount) {
			System.out.print("Enter grade #"+counter+": ");
			int grade=input.nextInt();
			System.out.println("You have earned "+grade);
			if(grade==-1) {
				counter=counter-1;
				break;
			}
			sum+=grade;
			counter++;
		}
		//for with break
		for(;counter<=studentsCount;) {
			System.out.print("Enter grade #"+counter+": ");
			int grade=input.nextInt();
			System.out.println("You have earned "+grade);
			if(grade==-1) {
				counter=counter-1;
				break;
			}
			sum+=grade;
			counter++;
		}
		//Without break
		//while without break
		while(flag) {
			System.out.print("Enter grade #"+counter+": ");
			int grade=input.nextInt();
			System.out.println("You have earned "+grade);
			if(grade==-1) {
			flag=false;
			counter=counter-1;
			}
			else {
				sum+=grade;
				counter++;
			}
		}
		//for without break
		for(;flag;) {
			System.out.print("Enter grade #"+counter+": ");
			int grade=input.nextInt();
			System.out.println("You have earned "+grade);
			if(grade==-1) {
			flag=false;
			counter=counter-1;
			}
			else {
				sum+=grade;
				counter++;
			}
		}
		studentsCount=counter;
		avg=sum/studentsCount;
		System.out.println();
		System.out.println(counter);
		System.out.println("Grade sum : "+sum +", Grades average: "+avg);

	}

}
