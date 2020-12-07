package com.xworkz.util;

import com.xworkz.bucket.Bucket;

public class BucketUtil {

		public static void main(String[] args) {
			
			Bucket buck=new Bucket();
			buck.setSize(20);
			buck.setColor("blue");
			buck.setShape("round");
			buck.setPrice(50);
			buck.setBrand("Ratan");
			
			System.out.println(buck.getSize()+" "+buck.getColor()+" "+buck.getShape()+" "+buck.getPrice()+" "+buck.getBrand());
			}


}
