package com.xworkz.xworkzapp;

public class HumanTester {
	public static void main(String[] args) {
		Human human=new Human();
		human.setName("Avatar");
		human.setAge(26);
		human.setAdharCardNumber(101);
		System.out.println(human);
		
		Human agastya=new Human();
		agastya.setName("Agastya");
		agastya.setAge(26);
		agastya.setAdharCardNumber(102);
		System.out.println(agastya);

		Human seema=new Human();
		seema.setName("Seema Patil");
		seema.setAge(21);
		agastya.setAdharCardNumber(100);
		System.out.println(seema);

		Human rakshu=new Human();
		rakshu.setName("mentu");
		rakshu.setAge(23);
		rakshu.setAdharCardNumber(100);
		System.out.println(rakshu);

		Human arjun=new Human();
		arjun.setName("Arjun");
		arjun.setAge(29);
		arjun.setAdharCardNumber(100);
		System.out.println(arjun.toString()); //explicitly calling toString() method

		System.out.println(human.hashCode());
		System.out.println(arjun.hashCode());
		System.out.println(seema.hashCode());
		System.out.println(agastya.hashCode());
		System.out.println(rakshu.hashCode());

		String pandu="pandu"; 
		System.out.println(arjun.equals(pandu));
	}
}