
//HASHMAP
//1. Write a Java program to traverse / iterate all the keys with the specified value in a HashMap(1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)
//[hint : 6. Iterating Over Map in the worked out example]
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class P1 {
	public static void main(String[] args) {
		HashMap< Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
	
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
		System.out.println("Key: "+entry.getKey() + " -> Value: " + entry.getValue());
		}
		
	}
	

}

//2. Remove the following all elements from the HashMap then verify that its size is zero andinclude once again following elements and check its size(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)
//[ Hint : clear() , size() and put()]
public class P2 {
	public static void main(String[] args) {
		Map< Integer,String> hashMap = new HashMap<>();
		// 1. Basic Operations
		// Adding elements
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		hashMap.clear();
		System.out.println("After removing All elements size : "+hashMap.size());
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		System.out.println("After Adding All elements size : "+hashMap.size());
	}

}

//3.Write a Java program to copy all mappings from the specified map to another map as shown belowHashmap1 => ( 1, "Red") ,(2, "Green"), (3, "Black")Hashmap2 => (4, "White"),(5, "Blue"),(6, "Orange")
//Add all the values of Hashmap1 intoLiberation Serif Hashmap2 and print the result
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> map1 = new HashMap<>();
		map1.put( 1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		// Merging maps
		Map<Integer,String> map2 = new HashMap<>();
		map2.put(4, "White");
		map2.put(5, "Blue");
		map2.put(6, "Orange");
		map2.forEach((key, value) ->
		map1.merge(key, value, (v1, v2) -> v1 + v2));
		System.out.println("After merging maps: " + map1);
	}

}
//4.Write a Java program to check whether a map contains Key-Values mappings (empty) or notafter adding all the following elements into Hashmap and after removing all the elements from the Hashmap.
//(1, "Red"),(2, "Green"), (3, "Black"), (4, "White"),(5, "Blue")
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> map1 = new HashMap<>();
		map1.put( 1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		boolean res=map1.isEmpty();
		System.out.println("Before Removing: "+res);
		map1.clear();
		
		res=map1.isEmpty();
		System.out.println("After removing: "+res);

	}

}

//TREE MAP
//5. Write a Java program to traverse / iterate all the keys with the specified value in a TreeMap(1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)
//[ hint : put() ; for (Map.Entry<Integer,String> entry : tree_map.entrySet()); getKey() and getValue()]
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> treeMap = new TreeMap<>();
		treeMap.put(1,"Apple");
		treeMap.put(2,"Strawberry");
		treeMap.put(3,"Pear");
		treeMap.put(4,"Cucumber");
		treeMap.put(5,"Grapes");
	
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : treeMap.entrySet()) {
		System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
//6.2. Write a Java program to search for keys C4 and C5 are present or not in the following Tree Map.("C1", "Red"); ("C2", "Green"); ("C3", "Black");("C4", "White")
import java.util.HashMap;
import java.util.*;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< String,String> map1 = new TreeMap<>();
		map1.put( "c1", "Red");
		map1.put("c2", "Green");
		map1.put("c3", "Black");
		map1.put("c4", "White");
		
		System.out.println("Whehther it contains c4 or not: "+map1.containsKey("c4"));
		System.out.println("Whehther it contains c5 or not: "+map1.containsKey("c5"));

	}

}
//7. Remove the following all elements from the TreeMap then verify that its size is zero andinclude once again following elements and iterate them and check its size(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)
[// Hint : clear() , size() and put()]
import java.util.HashMap;
import java.util.*;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> Map = new TreeMap<>();
		// 1. Basic Operations
		// Adding elements
		Map.put(1,"Apple");
		Map.put(2,"Strawberry");
		Map.put(3,"Pear");
		Map.put(4,"Cucumber");
		Map.put(5,"Grapes");
		Map.clear();
		System.out.println("After removing All elements size : "+Map.size());
		Map.put(1,"Apple");
		Map.put(2,"Strawberry");
		Map.put(3,"Pear");
		Map.put(4,"Cucumber");
		Map.put(5,"Grapes");
		System.out.println("After Adding All elements size : "+Map.size());

	}

}

//8.Write a Java program to get the first (lowest) key and the last (highest) key currently in thefollowing Treemap.("C2", "Red"),("C1", "Green"), ("C4", "Black"), ("C3", "White")
//[ Hint : firstKey() and lastKey() ]
import java.util.*;
import java.util.TreeMap;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap< String,String> map1 = new TreeMap<>();
		map1.put( "c2", "Red");
		map1.put("c1", "Green");
		map1.put("c4", "Black");
		map1.put("c3", "White");
		System.out.println(map1);
		System.out.println("The first key is: "+map1.firstKey());
		System.out.println("The Last key is: "+map1.lastKey());

	}

}

//LinkedHashMap

//9. Write a Java program to traverse / iterate all the keys with the specified value in a linkedHashMap (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”) and display
//only elderly entered 4 elements only

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n=== LinkedHashMap Demonstration ===");
        Map<Integer,String> Map = new LinkedHashMap<>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer,String> eldest) {
                return size() > 4; // Remove eldest entry if size exceeds 4
            }
        };
		Map.put(1,"Apple");
		Map.put(2,"Strawberry");
		Map.put(3,"Pear");
		Map.put(4,"Cucumber");
		Map.put(5,"Grapes");
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : Map.entrySet()) {
		System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println("Elderly entries(To display only 4 elements):");
		System.out.println("After adding 5 (notice removal of eldest): " + Map);	
		}
	}

//10.Include the following elements into the LinkedHashMap called programminglanguages and print allof them. ("Java", 1995);("Python", 1991);(“JavaScript", 1995);("C++", 1985);
import java.util.*;
import java.util.TreeMap;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> programminglanguages = new LinkedHashMap<>();
		programminglanguages.put("Java", 1995);
		programminglanguages.put("Python", 1991);
		programminglanguages.put("JavaScript", 1995);
		programminglanguages.put("C++", 1985);
		System.out.println(programminglanguages);
	}

}
//11. Include the following elements into the LinkedHashMap called programminglanguages and print asfollows.
//Java was developed in 1995
//Python was developed in 1991.
//JavaScript was developed in 1995
//C++ was developed in 1985
import java.util.LinkedHashMap;
import java.util.*;
import java.util.Map.Entry;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> programminglanguages = new LinkedHashMap<>();
		programminglanguages.put("Java", 1995);
		programminglanguages.put("Python", 1991);
		programminglanguages.put("JavaScript", 1995);
		programminglanguages.put("C++", 1985);
		for (Entry< String,Integer> entry : programminglanguages.entrySet()) {
			System.out.println(entry.getKey() + " was developed in " + entry.getValue());
			}
	}

}
//12. Add elements in the same order in the LinkedHaspMap using for() loop and put() String[] keys = {"C", "A", "B", "E", "D"}; Integer[] values = {3, 1, 2, 5, 4};
import java.util.LinkedHashMap;
import java.util.Map;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] keys = {"C", "A", "B", "E", "D"};
		Integer[] values = {3, 1, 2, 5, 4};
		Map<String,Integer> lMap = new LinkedHashMap<>();
		for(int i=0;i<keys.length;i++) {
			lMap.put(keys[i], values[i]);
		}
		System.out.println(lMap);

	}

}
