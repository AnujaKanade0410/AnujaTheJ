package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Matrix {

    // Complete the minTime function below.
    static int minTime(int[][] roads, int[] machines, int n) {
    	/*Integer[][] sortedArray=Arrays.stream(roads).boxed().toArray( Integer[][]::new );
    	
    	Arrays.sort(new Integer[][](roads),new Comparator<Integer[]>(){

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				Integer timeOne=o1[2];
				Integer timeTwo=o2[2];
				return timeOne.compareTo(timeTwo);
			}
    		
    	});*/
    	
    	int time=0;
    	for(int i=0;i < n-1; i++){
    		for(int j=0; j < 2; j++){
    			if(arrContains(machines, roads[i][j])){
    				if(arrContains(machines,roads[i][j+1])){
    					time=time+roads[i][j+2];
    				}
    			}
    		}
    	}
		return 0;


    }

    static boolean arrContains(int[] machines, int arrItem){
    	for(int k=0;k < machines.length;k++){
    		if(machines[k]==arrItem){
    			return true;
    		}
    		
    	}
    	return false;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] roads = new int[n - 1][3];

        for (int i = 0; i < n - 1; i++) {
            String[] roadsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int roadsItem = Integer.parseInt(roadsRowItems[j]);
                roads[i][j] = roadsItem;
            }
        }

        int[] machines = new int[k];

        for (int i = 0; i < k; i++) {
            int machinesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            machines[i] = machinesItem;
        }

        int result = minTime(roads, machines, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
