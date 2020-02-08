package com.an;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SortedArrayTest1 {

	/**
	 * sort an array without removing duplicates
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" numbers.");
		for(int i=0; i<n; i++){
			arr[i]=scan.nextInt();
		}
		
		Set<Integer> arrSet=new HashSet<Integer>();
		for(int i=0; i<n; i++){
			arrSet.add(arr[i]);
		}
		Iterator itr=arrSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}
	}
}
