package com.an;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Colletcors;

public class HackerStr3 {
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] charArr=A.toCharArray();
        List<Character> list=new ArrayList<Character>();
        for(char c:charArr){
            list.add(c);
        }
        Collections.reverse(list);
        String strRev=list.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println("String: "+A+"String reverse: "+strRev);
        if(A.equals(strRev)){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
        
    }
}
