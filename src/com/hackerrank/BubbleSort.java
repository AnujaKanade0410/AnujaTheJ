package com.an;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
    	int n=a.length;
    	int count=0;
    	int temp=0;
    	for (int i = 0; i < n; i++) {
    	    
    	    for (int j = 0; j < n - 1; j++) {
    	        // Swap adjacent elements if they are in decreasing order
    	        if (a[j] > a[j + 1]) {
    	        	count++;
    	        	temp=a[j];
    	        	a[j]=a[j+1];
    	        	a[j+1]=temp;
    	            //swap(a[j], a[j + 1]);
    	        }
    	    }
    	    
    	}
    	System.out.println("Array is sorted in "+ count+" swaps");
    	System.out.println("First Element: "+a[0]);
    	System.out.println("Last Element: "+a[n-1]);
    }
    
    public static void swap(int p, int q){
    	int temp = p;
    	p=q; 
    	q=temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}