package com.an;

import java.util.Arrays;
import java.util.List;



public class abc{
	public static void main(String [] args) {
        int j = 2, y = 3, z = 10;
        for (;j < 6;j++) {
            y = (++y + z++);
            System.out.println(y+z);
        }
    }

}

