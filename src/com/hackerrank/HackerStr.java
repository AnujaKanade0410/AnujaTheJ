package com.an;

import java.util.Scanner;

public final class HackerStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum=A.length()+B.length();
        System.out.println(sum);
        if(A.compareToIgnoreCase(B) > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        char first=A.charAt(0);
        sb1.append(String.valueOf(first).toUpperCase());
        sb1.append(A.substring(1));
        first=B.charAt(0);
        sb2.append(String.valueOf(first).toUpperCase());
        sb2.append(B.substring(1));
        System.out.println(sb1+" "+sb2);
	}

}
