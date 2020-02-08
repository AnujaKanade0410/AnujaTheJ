package com.an;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SortedArrayTest {

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
		Arrays.sort(arr);
		System.out.println("Array after sorting");
		for(int i=0; i<n; i++){
			System.out.println(arr[i]+" ");
		}
	}
}
