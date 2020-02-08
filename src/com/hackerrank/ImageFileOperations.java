package com.an;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/* This program demonstrates how to read and write image files */
public class ImageFileOperations {
	public static void main(String[] args) {
		int width=960;
		int height=650;
		BufferedImage image = null;
		File f=null;
		//read image
		try{
			f= new  File("C:/Photos/images/GANESH8.jpg");
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			image = ImageIO.read(f);
			System.out.println("Reading completed");
		}catch(Exception e){
			System.out.println("Exception occured while reading image: "+e.getMessage());
			e.printStackTrace();
		}
		
		//write image
		try{
			f= new  File("D:/Anuja/IMP/Workspace/images/output.jpg");
			ImageIO.write(image, "jpg", f);
			System.out.println("Writing completed");
		}catch(Exception e){
			System.out.println("Exception occured while writing image: "+e.getMessage());
			e.printStackTrace();
		}
	}

}
