package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> li=new LinkedList<String>();
//ADD
		li.add("Archie");
		li.add("Charles");
		li.add("Betty");
		li.add("Jughead");
		System.out.println(li);
		li.add(1, "Veronica");
		System.out.println(li);
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Array1");
		ar.add("Array2");
		ar.add("Array3");
		
		li.addAll(ar);
		System.out.println(li);
		
		li.addAll(2, ar);
		System.out.println(li);
		
		li.addFirst("Riverdale");
		System.out.println(li);
		li.addLast("Names");
		System.out.println(li);
		
//CLONE
	LinkedList<String> secli=new LinkedList<String>();
	secli=(LinkedList)li.clone();
    System.out.println("List after clone():"+secli);

//CONTAINS
	System.out.println("li contains ar:"+li.contains("Array2"));	
//GET
	li.get(4);
	System.out.println("GETs object at index 4:"+li.get(4));
	
	li.getFirst();
	System.out.println("Gets first obj;"+li.getFirst());

	li.getLast();
	System.out.println("Gets Last obj;"+li.getLast());
	
//INDEXOF	
	li.indexOf("Betty");
	System.out.println("Returns index of \"Betty\":"+li.indexOf("Betty"));
	
	li.lastIndexOf("Array2");
	System.out.println("Return last occurrence of the Object:"+li.lastIndexOf("Array2"));
	
//POLL	
	System.out.println("Poll:"+li.poll()+"\n"+li);
	
	System.out.println("Pollfirst:"+li.pollFirst()+"\n"+li);
	
	System.out.println("PollLast:"+li.pollLast()+"\n"+li);
//REMOVE	
	li.remove();
	System.out.println("First element gets removed:"+li);
	
	li.remove(7);
	System.out.println("Element at index 7 gets removed:"+li);
	
	li.remove("Array2");
	System.out.println("Object Array2 gets removed:"+li);
	
	li.removeFirst();
	System.out.println("First elemnt gets removed:"+li);
	
	li.removeLast();
	System.out.println("Last elemnt gets removed:"+li);
	
	li.add("Array3");
	li.add("Array1");
	System.out.println(li);
	li.removeFirstOccurrence("Array3");
	li.removeLastOccurrence("Array1");
	System.out.println(li);
	
//SET
	li.set(1, "Archie");
	System.out.println(li);
//SIZE	
	li.size();
	System.out.println("SIZE of the list li is:"+li.size());
//CLEAR
	li.clear();
	System.out.println(li);
	}

}
