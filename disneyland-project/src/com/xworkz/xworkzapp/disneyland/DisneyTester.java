package com.xworkz.xworkzapp.disneyland;

public class DisneyTester {

		public static void main(String[] args) {
			DisneyLand disney=new DisneyLand();
			disney.setCharacterName("Barbie");
			disney.setCharacterid(101);
			System.out.println(disney);
			
			DisneyLand elsa=new DisneyLand();
			elsa.setCharacterName("Elas");
			elsa.setCharacterid(102);
			System.out.println(elsa);
			
			DisneyLand ana=new DisneyLand();
			ana.setCharacterName("Ana");
			ana.setCharacterid(103);
			System.out.println(ana);
			
			DisneyLand olaf=new DisneyLand();
			olaf.setCharacterName("Olaf");
			olaf.setCharacterid(104);
			System.out.println(olaf);
			
			DisneyLand steven=new DisneyLand();
			steven.setCharacterName("Steven");
			steven.setCharacterid(105);
			System.out.println(steven);
		
			System.out.println(disney.hashCode());
			System.out.println(elsa.hashCode());
			System.out.println(ana.hashCode());
			System.out.println(olaf.hashCode());
			System.out.println(steven.hashCode());
			
			System.out.println(disney.equals(olaf));


		}

	}


