package com.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHadlingEasy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		System.out.println("Enter 2 integers");
        Scanner sc= new Scanner(System.in);
        
        int z=0,x=0,y=0;
        try{
            x= sc.nextInt();
            y=sc.nextInt();
            z=x/y; 
            System.out.println(z);
        }catch(ArithmeticException ae){
          throw ae;
        }catch(InputMismatchException ime){
            System.out.println(ime.getStackTrace());
        }
	}

}
