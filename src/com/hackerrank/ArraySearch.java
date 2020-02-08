package com.an;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[], first, last, middle, search, n, c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=in.nextInt();
		array=new int[n];
		System.out.println("Enter "+n+" integers");
		for(int i=0; i < n; i++){
			array[i]=in.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Enter the number to search");
		search=in.nextInt();
		first=0;
		last=n-1;
		while(first<=last){
			middle=(first+last)/2;
			if(array[middle] < search){
				first=middle+1;
			}else if(array[middle]==search){
				System.out.println("Number "+search+" found at "+(middle+1)+" location");
				return;
			}else{
				last=middle-1;
			}
			if(first>last){
				System.out.println("The number "+search+" is not found in the array");
			}
		}
	}
}
