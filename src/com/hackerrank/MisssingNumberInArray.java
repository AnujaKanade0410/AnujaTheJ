package com.hackerrank;

import java.util.Scanner;

public class MisssingNumberInArray {

	public static void main(String[] args) {
		int n=0;
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[];
        while(t > 0) {
        	n=in.nextInt();
        	arr=new int[n-1];
        	for(int i=0;i<n-1; i++) {
        		arr[i]=in.nextInt();	
        	}
        	int missingNumber=missingNumber(arr,n-1);
        	System.out.println("Missing number: "+missingNumber);
        	t--;
        }
	}

	private static int missingNumber(int[] arr, int n) {
		int total=0;
		total=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++) {
			total=total-arr[i];
		}
		return total;
	}

}
