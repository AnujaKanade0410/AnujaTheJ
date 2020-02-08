package com.an;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringAnagram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	int count=0;
    	
    	Set<Character> charSet1=new LinkedHashSet<Character>();
    	Set<Character> charSet2=new LinkedHashSet<Character>();
    	for(char c: a.toCharArray()){
    		charSet1.add(c);
    	}
    	for(char c: b.toCharArray()){
    		charSet2.add(c);
    	}
    	if(charSet1.size() <= charSet2.size()){
    		count=charSet1.size();
    	}else{
    		count=charSet2.size();
    	}
    	Iterator<Character> itr=charSet1.iterator();  
    	  while(itr.hasNext()){
    		  char c1=itr.next();
    		  if(charSet1.contains(c1)){
    			  charSet1.remove(c1);
    			  charSet2.remove(c1);
    		  }
    	  }  
     	System.out.println(a);
    	System.out.println(b);
    	return charSet1.size()+charSet2.size() ;
    	 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new InputStreamReader(System.in));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        
        System.out.println(String.valueOf(res));

        

        scanner.close();
    }
}
