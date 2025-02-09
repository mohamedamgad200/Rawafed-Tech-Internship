package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String []args)
	{
		String []colorsArray=new String[5];
		//Orderedand Not Sorted DataStructure
		ArrayList<String>colorsList=new ArrayList<>();
		colorsArray[0]="White";
		//colorsArray[1]=13;//error
		
		colorsList.add("White");
		//colorsList.add(13);
		colorsList.add("Red");
		colorsList.add("Blue");
		colorsList.add("Brown");
		for(String color:colorsList) {
			System.out.println(color);
		}
		System.out.println("**********************");
		colorsList.add(2,"Green");
		for(String color:colorsList) {
			System.out.println(color);
		}
		System.out.println("**********************");
		//Generics
		List<Integer> grades=new ArrayList<>();
		grades.add(65);
		grades.add(87);
		//grades.add("hello");
		//colorsArray.length
		int total=0;
		for(Object grade:grades) {
			Integer gradeInt=(Integer)grade;
			total+=gradeInt;
		}
		int avg=total/grades.size();
		System.out.println("Average is "+avg);
	}

}
