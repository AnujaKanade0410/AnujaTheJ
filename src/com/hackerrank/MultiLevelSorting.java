package com.an;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeTest{
	private String name;
	private String jobTitle;
	private int age;
	private int salary;
	
	public EmployeeTest(String name, String jobTitle, int age, int salary){
		this.name=name;
		this.jobTitle=jobTitle;
		this.age=age;
		this.salary=salary;
	}
	
	
	public String getName() {
		return name;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public int getAge() {
		return age;
	}


	public int getSalary() {
		return salary;
	}


	public String toString(){
		return String.format("%s\t%s\t%d\t%d", name,jobTitle,age,salary);
	}
}

class EmployeeChainedComparator implements Comparator<EmployeeTest>{
	List<Comparator<EmployeeTest>> listComparators;
	
	public EmployeeChainedComparator(Comparator<EmployeeTest>...comparators){
		this.listComparators=Arrays.asList(comparators);
	}

	@Override
	public int compare(EmployeeTest emp1, EmployeeTest emp2) {
		for(Comparator<EmployeeTest> comparator: listComparators){
			int result=comparator.compare(emp1, emp2);
			if(result != 0){
				return result;
			}
		}
		return 0;
	}
}

class EmployeeJobTitleComparator implements Comparator<EmployeeTest>{

	@Override
	public int compare(EmployeeTest emp1, EmployeeTest emp2) {
		return emp1.getJobTitle().compareTo(emp2.getJobTitle());
	}
}

class EmployeeAgeComparator implements Comparator<EmployeeTest>{

	@Override
	public int compare(EmployeeTest emp1, EmployeeTest emp2) {
		return emp1.getAge() - emp2.getAge();
	}	
}

class EmployeeSalaryComparator implements Comparator<EmployeeTest>{

	@Override
	public int compare(EmployeeTest emp1, EmployeeTest emp2) {
		return emp1.getSalary() - emp2.getSalary();
	}
}
public class MultiLevelSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<EmployeeTest> empList= new ArrayList<EmployeeTest>();
		
		empList.add(new EmployeeTest("Tom", "Developer", 45, 80000));
		empList.add(new EmployeeTest("Sam", "Designer", 30, 75000));
		empList.add(new EmployeeTest("Bob", "Designer", 45, 134000));
		empList.add(new EmployeeTest("Peter", "Programmer", 25, 60000));
		empList.add(new EmployeeTest("Tim", "Designer", 45, 130000));
		empList.add(new EmployeeTest("Craig", "Programmer", 30, 52000));
		empList.add(new EmployeeTest("Anne", "Programmer", 25, 51000));
		empList.add(new EmployeeTest("Alex", "Designer", 30, 120000));
		empList.add(new EmployeeTest("Bill", "Programmer", 22, 30000));
		empList.add(new EmployeeTest("Samuel", "Developer", 28, 80000));
		empList.add(new EmployeeTest("John", "Developer", 35, 67000));
		empList.add(new EmployeeTest("Patrick", "Developer", 35, 140000));
		empList.add(new EmployeeTest("Alice", "Programmer", 35, 80000));
		empList.add(new EmployeeTest("David", "Developer", 35, 99000));
		empList.add(new EmployeeTest("Jane", "Designer", 30, 82000));
		
		System.out.println("*** Before Sorting ***");
		for(EmployeeTest e:empList){
			System.out.println(e);
		}
		
		Collections.sort(empList, new EmployeeChainedComparator(
				new EmployeeJobTitleComparator(),
				new EmployeeAgeComparator(),
				new EmployeeSalaryComparator()));
		System.out.println("*** After Sorting ***");
		
		for(EmployeeTest e:empList){
			System.out.println(e);
		}
	}
}


