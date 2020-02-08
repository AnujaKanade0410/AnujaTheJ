package com.hackerrank;

import java.util.Scanner;

public class ExceptioHandlingEasy1 {

	int power=0;
	public int power(int n, int p){
	    try{
	    if(n<0 || p<0){
	        throw new Exception("n and p should be non-negative");
	    }else{
	        for(int i=0; i == p; i++){
	            power=n*n;
	        }
	    }
	    }catch(Exception e){
	        System.out.println(e);
	    }
	    return power;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 integers");
        while(in.hasNextInt())
        {
        	
            int n = in.nextInt();
            int p = in.nextInt();
            ExceptioHandlingEasy1 M = new ExceptioHandlingEasy1();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }


	}

}
