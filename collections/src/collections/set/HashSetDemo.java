package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Not Order and Not Sorted DataStructure
   Set<String>colorsSet=new HashSet<>();
   colorsSet.add("White");
   colorsSet.add("Black");
   colorsSet.add("Red");
   for(String color:colorsSet)
   {
	   System.out.println(color);
   }
	}

}
