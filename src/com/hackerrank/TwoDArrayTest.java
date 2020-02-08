package com.hackerrank;

import java.util.Scanner;

public class TwoDArrayTest {
	static int R=6;
    static int C=6;
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        if (R < 3 || C < 3) 
        	System.out.println(-1);
        
        int maxSum=Integer.MIN_VALUE;
        for(int arr_i=0; arr_i < R-2; arr_i++){
            for(int arr_j=0; arr_j < C-2; arr_j++){
            	int sum=arr[arr_i][arr_j]+arr[arr_i][arr_j+1]+arr[arr_i][arr_j+2]
            	               +arr[arr_i+1][arr_j+1]+
            	               arr[arr_i+2][arr_j]+arr[arr_i+2][arr_j+1]+arr[arr_i+2][arr_j+2];
            	maxSum=Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
	}
}
