package com.an;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparable {
	private String name;
	private String lastName;
	public PersonComparable(String name, String lastName){
		this.name=name;
		this.lastName=lastName;
	}
	
	public String getName(){
		return name;	
	}
	public String getLastName(){
		return lastName;
	}
	public int compareTo(PersonComparable p){
		return this.name.compareTo(p.name);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<PersonComparable> myList=new ArrayList<PersonComparable>();
		myList.add(new PersonComparable("Robert","USA"));
		myList.add(new PersonComparable("Andy","UK"));
		myList.add(new PersonComparable("Harish","India"));
		Collections.sort(myList);
		for(PersonComparable p: myList){
			System.out.println("May name is :"+p.getName());
			
		}
	}

}
