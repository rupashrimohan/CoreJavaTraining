package com.collections;

import java.util.ArrayDeque;

public class TestDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<String> deque = new ArrayDeque<String>();
		
		deque.offer("A");
		deque.offerFirst("B");
		deque.offerLast("C");
		
		System.out.println(deque);

		deque.addFirst("a");
		System.out.println(deque);
		deque.addLast("D");
		System.out.println(deque);

//CONTAINS
		System.out.println("This deque contains c:"+deque.contains("c"));
		
//GET
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());

//PEEK
		System.out.println("PEEK"+deque.peek());
		System.out.println(deque);
		
		System.out.println("PEEK FIRST:"+deque.peekFirst());
		System.out.println(deque);
		
		System.out.println("PEEK LAST;"+deque.peekLast());
		System.out.println(deque);
		
//POLL		
		System.out.println("POLL:"+deque.poll());
		System.out.println(deque);

		System.out.println("POLL FIRST;"+deque.pollFirst());
		System.out.println(deque);
		System.out.println("POLL LAST:"+deque.peekLast());
		System.out.println(deque);
//SIZE
		System.out.println("SIZE"+deque.size());
	}

}
