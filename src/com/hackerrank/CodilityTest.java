package com.an;

import java.util.Arrays;
import java.util.Scanner;

public class CodilityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println("Enter number of elements in array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+"elements in array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter number of columns");
		int k=sc.nextInt();*/
		int a[]={4,35,80,999,456,12345,98,7000,9,65};
		int k=4;
		printTable(a,k);
	}

	private static void printTable(int[] a, int k) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		Arrays.sort(a);
		int maxNum=a[a.length-1];
		String s=maxNum+"";
		int maxcnt=s.toCharArray().length;
		
		int rows, cols=k;
		rows=a.length/k;
		if(a.length%k!=0){
			rows=rows+1;
		}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print("+");
				for(k=0;k<maxcnt;k++){
					System.out.print("-");
				}
			}
		}
		
	}

}
