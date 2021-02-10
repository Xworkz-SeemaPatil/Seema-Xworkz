package com.xworkz.solution;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SolutionTester {
	public static void main(String[] args) {
		
		String cadbury="dairy milk";
		String nestle="Kit kat";
		String hersheys="Hershey's Kisses";
		String parle="Kiss me";
		String amul="Dark Chocolate";
		
		Collection<String> chocolates=new ArrayList();
		List chocoCollection=new ArrayList();
		chocolates.add(cadbury);
		chocolates.add(parle);
		chocolates.add(hersheys);
		chocolates.add(amul);
		chocolates.add(nestle);
		
		int totalElements=chocolates.size();
		System.out.println("total number of chocolates"+totalElements);
		System.out.println(chocolates);
		
		boolean added = false;
		added = chocolates.add(hersheys);
		System.out.println(added);
		added = chocolates.add(nestle);
		System.out.println(added);
		added = chocolates.add(cadbury);
		System.out.println(added);
		added = chocolates.add(amul);
		System.out.println(added);
		added = chocolates.add(parle);
		System.out.println(added);

		totalElements = chocolates.size();
		System.out.println("totalElements: " + totalElements);
		
		String campco = "campcos";
		boolean removed = chocolates.remove(null);
		System.out.println("Removed : " + removed);
		String ref = null;
		if (ref != null) {
			System.out.println(ref.toString());
			// return true;
		}
		added = chocolates.add(null);
		System.out.println("added null:" + added);
		added = chocolates.add(null);
		System.out.println("added null:" + added);
		totalElements = chocolates.size();
		System.out.println("totalElements: " + totalElements);

		chocolates.add(parle);
		totalElements = chocolates.size();
		System.out.println("totalElements after adding duplicate: " + totalElements);
		chocolates.remove(parle);
		chocolates.remove(parle);
		totalElements = chocolates.size();
		System.out.println("totalElements: " + totalElements);

		System.out.println("looping chocolates");

		Object[] convertedChocolates = chocolates.toArray();
		for (int i = 0; i < convertedChocolates.length; i++) {
			System.out.println(convertedChocolates[i]);
		}

		System.out.println("looping using iterator");
	
		Iterator iterator = chocolates.iterator();
		boolean a= iterator.hasNext();
		System.out.println(a);
		String str = (String) iterator.next();
		System.out.println(str);
		iterator.remove();
		//System.out.println(chocolates);
		
		//iterator.hasNext();
		//hasNext();next();remove();
		/*
		 * while (iterator.hasNext()) { System.out.println("element present"); Object
		 * str = iterator.next(); ut.System.oprintln(str); }
		 */
		chocolates.removeAll(chocolates);
		boolean empty=chocolates.isEmpty();
		System.out.println(empty);

		//System.out.println(chocolates);
	}
}