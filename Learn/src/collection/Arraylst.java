package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylst {

	public static void main(String[] args) {
		
		List <String> items= new ArrayList<String>();
		
		items.add("one");
		items.add("two");
		items.add("three");
		items.add(2, "test");
		System.out.println(items);
		Collections.sort(items);
		System.out.println(items);
		items.remove(items.size()-1);
		System.out.println(items);
	}

}
