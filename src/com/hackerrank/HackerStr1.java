package com.an;

import java.util.Scanner;

public class HackerStr1 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String result=S.substring(start, end);
        System.out.println(result);
    }
}
