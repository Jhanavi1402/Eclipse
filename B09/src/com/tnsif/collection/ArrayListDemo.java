package com.tnsif.collection;

import java.util.ArrayList;
import java.util.Collections;
public interface ArrayListDemo {
	public static void main(String[] args) {
		ArrayList <Integer> List=new ArrayList <Integer> ();
		System.out.println("the size of the arrayList"+List.isEmpty());
		System.out.println("the size of the arrayList"+List.size());
		List.add(2);
		List.add(4);
		List.add(4);
		List.add(3);
		List.add(22);
		//List.add(null);
		System.out.println("the size of arraylist"+List.size());
		System.out.println(List);
		System.out.println(List.contains(55));
		System.out.println(List.remove(1));
		System.out.println(List);
		System.out.println(List.get(0));
		Collections.sort(List);
		System.out.println(List);
		}
	

}
