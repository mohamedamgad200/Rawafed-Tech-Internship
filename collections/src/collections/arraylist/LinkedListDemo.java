package collections.arraylist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ordered And Not Sorted DataStructure
       List<String>linkedlistColors=new LinkedList<>();
       linkedlistColors.add("White");
       linkedlistColors.add("Black");
       linkedlistColors.add("Red");
       for(String color:linkedlistColors)
       {
    	System.out.println(color);   
       }
       
	}

}
