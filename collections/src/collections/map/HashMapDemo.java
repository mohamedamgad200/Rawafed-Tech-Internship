package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<Integer,String>emps=new HashMap<>();
    emps.put(2136,"Ahmed");
    emps.put(1457,"Mohamed");
    emps.put(1456,"Mahmoud");
    emps.put(1256,"Nada");
    emps.put(1534,"Amgad");
    emps.put(1432,"Ibrahim");
    Set<Integer>keys=emps.keySet();
    for(Integer key:keys)
    {
    	System.out.println(key+"=>"+emps.get(key));
    }
    emps.containsKey(1432);
	}

}
