package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class SockMerchant {
	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int temp=0, pair=0;
    	//List<Integer> items = Arrays.asList(1, 1, 2, 2, 2, 2);

    	Map<Integer,Integer> map= new HashMap<Integer,Integer>();
    	for(int a: ar){
    		if(map.containsKey(a)){
    			temp=map.get(a);
    			map.put(a, temp+1);
    		}else{
    			map.put(a, 1);
    		}
    			
    	}
    	
    	for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            pair=pair+entry.getValue()/2;
    	}
    		
    	return pair;
    	
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
*/
       /* for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }*/
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0; i < n; i++){
            ar[i] = in.nextInt();
        }

        int result = sockMerchant(n, ar);

        System.out.println(String.valueOf(result));
       

        scanner.close();
    }
}
