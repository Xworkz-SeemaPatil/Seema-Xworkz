package com.xworkz;

public class StringUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Arati";
		String s2="Arati";
		String s5=new String ("Arati");
		System.out.println(s1==s2);
		System.out.println(s1==s5);
		
		String s3="kalpana";
		String s4="kalpana";
		String s6="KAlpana";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s6));
		
		String s7="kalpana";
		String s21="kal";
		System.out.println(s7.compareTo(s21));
		
		
		String s8="aradhana";
		System.out.println(s8.toUpperCase());
		
		
		String s9="AMULYA";
		System.out.println(s9.toLowerCase());
		
		
		String s10="ashish";
		String s11="Ashish";
		System.out.println(s10.equalsIgnoreCase(s11));
		
		
		String s12="abhi";
		String s13="abhishek";
		System.out.println(s12.contains(s13));
		
		
		String s14="Life is wonderfull, only if you know how to live it";
		System.out.println(s14.length());
		
		String s15="     awesome    ";
		System.out.println(s15.trim());
		
		StringBuilder s16=new StringBuilder("Raichur");
		System.out.println(s16.reverse());
		
		String s17="Infinity and Beyond";
		System.out.println(s17.indexOf("t"));
		
		String s18="abhishek nandu";
		String s19="abhishek";
		System.out.println(s18.matches(s19));
		
		String s20="my name is seema patil";
		String[] finalS20=s20.split(" ");
		for(String string : finalS20) {
		System.out.println(string);
		
		char ch=s20.charAt(4);
		System.out.println(ch);
		}
	}

}
