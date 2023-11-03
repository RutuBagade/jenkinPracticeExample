package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
       System.out.println("ArrayList Examples----");
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("alex", "brian", "charles"));

		for (String name : namesList) {
			System.out.println(name);
		}
		
		System.out.println("LinkedList examples---");
		LinkedList<String> al = new LinkedList<String>();// creating linked list
		al.add("Rachit"); // adding elements
		al.add("Rahul");
		al.add("Rajat");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
