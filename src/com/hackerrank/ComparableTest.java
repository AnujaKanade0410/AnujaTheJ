package com.an;

import java.util.Arrays;

public class ComparableTest{

	public static void main(String[] args) {
		Employee[] empArr=new Employee[4];
		empArr[0]=new Employee(10,"A",46,90000);
		empArr[1]=new Employee(50,"B",25,30000);
		empArr[2]=new Employee(5,"C",40,70000);
		empArr[3]=new Employee(1,"D",50,100000);
		System.out.println("Before sorting: ");
		for(Employee e: empArr){
			System.out.println(" "+e.getId()+", "+e.getName()+","+e.getAge()+", "+e.getSalary());
		}
		Arrays.sort(empArr);
		System.out.println("Sorted Array is: ");
		for(Employee e: empArr){
			System.out.println(" "+e.getId()+", "+e.getName()+","+e.getAge()+", "+e.getSalary());
		}
	}

}

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;
	private long salary;
	
	Employee(int id, String name, int age, long salary){
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public long getSalary(){
		return salary;
	}

	@Override
	public int compareTo(Employee e) {
		return this.id-e.id;
	}
}