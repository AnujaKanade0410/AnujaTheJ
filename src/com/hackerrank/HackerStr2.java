package com.an;

import java.util.Arrays;
import java.util.Scanner;

public class HackerStr2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] strArr=new String[s.length()-(k-1)];
        
        for(int i=0;i <= s.length()-k;i++){
        	strArr[i]=s.substring(i, i+k);
        }
        Arrays.sort(strArr);
        smallest=strArr[0];
        largest=strArr[strArr.length-1];
        
        return smallest + "\n" + largest;
    }
}
