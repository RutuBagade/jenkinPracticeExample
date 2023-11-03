package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

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
		System.out.println("Hashmap Examples :------");
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");

		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
