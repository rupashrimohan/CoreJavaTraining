package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HASHSET//No duplicate values
		
		Set<String> hashset = new HashSet<String>();
		System.out.println("add() Method");
		hashset.add("Apple");//ADD method
		hashset.add("Mango");
		hashset.add("Banana");
		hashset.add("Orange");
		System.out.println(hashset);
		
		System.out.println("remove() Method");
		hashset.remove("Banana");//REMOVE method
		System.out.println(hashset);
		
		//CONTAINS method
		System.out.println("contains() Method");
		System.out.println("Hashset has Mango obj:"+hashset.contains("Mango"));
		System.out.println("Hashset has Banana obj:"+hashset.contains("Banana"));
		
		//ISEMPTY method
		System.out.println("isEmpty() method");
		System.out.println("Is the hashset empty:"+hashset.isEmpty());
		
		//SIZE method
		System.out.println("size() Method");
		System.out.println("The size of the above hash set is:"+hashset.size());
		//CLEAR method
		//hashset.clear();
		//System.out.println(hashset);
		
		hashset.add("Apple");
		hashset.add("Banana");
		System.out.println("Hashset after the addition of APPLE and BANANA"+hashset);

//TREESET //stores and order elements based on their value
		Set<String> treeset=new TreeSet<String>();
		treeset.add("n");
		treeset.add("o");
		treeset.add("l");
		treeset.add("m");
		System.out.println("TREESET");
		System.out.println(treeset);
		
//LINKED 	//maintiains the insertion order 
		Set<String> linkedhashset=new LinkedHashSet<String>();	
		linkedhashset.add("b");
		linkedhashset.add("a");
		linkedhashset.add("c");
		linkedhashset.add("d");
		System.out.println("LINKED HASHSET");
		System.out.println(linkedhashset);
	}

}
