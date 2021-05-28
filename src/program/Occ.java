	package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<String,Integer> map=new HashMap<String,Integer>();
	map.put("Arunjith", 1);
	map.put("Raju", 2);
	map.put("Manu", 3);
	
	for(Map.Entry hmap:map.entrySet()) {
		
		System.out.println(hmap.getKey());  
	}
	
	
	
}

}