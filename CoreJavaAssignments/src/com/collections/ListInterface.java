package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//ARRAYLIST -allows duplicate elements 
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add(1, "B");
		arrayList.add(2, "C");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println(arrayList);
		arrayList.add(2, "a");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		arrayList.add(arrayList.size(), "J");
		System.out.println(arrayList);
		
		// get an element from list
		String element= arrayList.get(0);
		System.out.println(element);
		
		List<String> sectionList = arrayList.subList(0, 3);
		
		System.out.println(sectionList);
		// iteration
		System.out.println("ITERATION of ARRAYLIST");
		for (String ele:arrayList)
			System.out.println(ele);
		System.out.println("ITERATION of section List");
		for (String sec:arrayList)
			System.out.println(sec);
		// contains
		
		System.out.println("ArrayList contains an element \"J\":"+arrayList.contains("J"));
		// containsAll
		
		System.out.println("Does arrayList contains all the elements of sectinlist:"+arrayList.containsAll(sectionList));
		// remove
		arrayList.remove(4);
		System.out.println("Remove the element in the index 4:"+arrayList);
		
		/*// removeAll
		arrayList.removeAll(sectionList);
		System.out.println("Removes all elements of sectionList from arrayList:"+arrayList);
		*/
		// retainAll

	/*	sectionList.retainAll(arrayList);
		System.out.println("ArrayList:"+arrayList);
		System.out.println("Section List:"+sectionList);*/

	}

}
