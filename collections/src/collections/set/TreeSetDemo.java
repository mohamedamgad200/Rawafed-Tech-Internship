package collections.set;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Not Order and Sorted DataStructure
		Set<String>colorsSet=new TreeSet<>();
		   colorsSet.add("White");
		   colorsSet.add("Black");
		   colorsSet.add("Red");
		   for(String color:colorsSet)
		   {
			   System.out.println(color);
		   }
	}

}
