package com.an;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HashtableHashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap hp=new HashMap();
		hp.put("1", "One");
		hp.put("2", "Two");
		hp.put("3", "Three");
		
		Hashtable ht =new Hashtable();
		
		ht.put("1", "duplicate");
		ht.put("4", "Four");
		
		System.out.println("Hashtable contents before copying");
		Enumeration e=ht.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		ht.putAll(hp);
		
		System.out.println("Hashtable contents after copying");
		e=ht.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}

}
