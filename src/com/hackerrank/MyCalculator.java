package com.hackerrank;

import java.util.Scanner;

public class MyCalculator {
	    int power=0;
	public int power(int n, int p)throws Exception{
	    
	    if(n<0 || p<0){
	        throw new Exception("n and p should be non-negative");
	    }else{
	    	power=n;
	        for(int i=1; i < p; i++){
	            power=power*n;
	        }
	    }
	    
	    return power;
	}
	public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            MyCalculator M = new MyCalculator();
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

