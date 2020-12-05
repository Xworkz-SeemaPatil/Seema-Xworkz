package com.xworkz;

public class StringBuf {
	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("Raja");
		buffer.append(20);
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		
		StringBuilder builder=new StringBuilder("Raja");
		builder.append("Rani");
		System.out.println(builder);
		
		System.out.println(builder.delete(4, 7));
		
		
		
	}

}
