package com.an;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CompareNumberBasedString implements Comparator<CharSequence> {
    private static final Pattern PATTERN = Pattern.compile("(\\d*)(\\D*)");
    public int compare(CharSequence c1, CharSequence c2) {
        Matcher matcher1 = PATTERN.matcher(c1);
        Matcher matcher2 = PATTERN.matcher(c2);
        while (matcher1.find() && matcher2.find()) {
        	if (matcher1.group(1).isEmpty()) {
                return matcher2.group(1).isEmpty() ? 0 : -1;
            } else if (matcher2.group(1).isEmpty()) {
                return +1;
            }
        	BigInteger number1 = new BigInteger(matcher1.group(1));
            BigInteger number2 = new BigInteger(matcher2.group(1));
            int numberCompare = number1.compareTo(number2);
            if (0 != numberCompare) {
                return numberCompare;
            }
            int nonDigitCompare = matcher1.group(2).compareTo(matcher2.group(2));
            if (0 != nonDigitCompare) {
                return nonDigitCompare;
            }
        }
        return matcher1.hitEnd() && matcher2.hitEnd() ? 0 : matcher1.hitEnd() ? -1 : +1;
    }
    public List<String> getSortedList(){
    	int loc;
    	String min="",temp="";
    	String strArr[]=new String[6];
    	strArr[0]="2A";
    	strArr[1]="2B";
    	strArr[2]="A";
    	strArr[3]="1A";
    	strArr[4]="20B";
    	strArr[5]="3A";
    	for(int i=0; i < strArr.length; i++){
    		min=strArr[i];
    		loc=i;
    		for(int j=i+1; j < strArr.length; j++){
    			int comparisonNum=compare(strArr[j],min);
    			System.out.println("comparisonNum: "+comparisonNum);
    			if(comparisonNum < 0){
    				min=strArr[j];
    				loc=j;
    			}
    		}
    		temp=strArr[i];
    		strArr[i]=strArr[loc];
    		strArr[loc]=temp;
    		System.out.println("Now array looks like:");
    		for(String a:strArr){
        		System.out.println(a);
        	}
       	}
		return Arrays.asList(strArr);
    	
    	
    	
    }
    public static void main(String args[]){
    	CompareNumberBasedString c=new CompareNumberBasedString();
      	for(String a:c.getSortedList()){
    		System.out.println(a);
    	}
    	
    }
}