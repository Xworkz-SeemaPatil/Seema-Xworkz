package com.xworkz.xworkzapp.ship;

public class ShipTester {
	public static void main(String[] args) {
		Ship ship=new Ship();
		ship.setShipName("Titanic");
		ship.setShipId(10000);
		System.out.println(ship);
		
		Ship ship1=new Ship();
		ship1.setShipName("samll ship");
		ship1.setShipId(10345);
		System.out.println(ship1);
		
		Ship ship2=new Ship();
		ship2.setShipName("large ship");
		ship2.setShipId(104560);
		System.out.println(ship2);
		
		Ship ship3=new Ship();
		ship3.setShipName("ship ship");
		ship3.setShipId(145600);
		System.out.println(ship3);
		
		Ship ship4=new Ship();
		ship4.setShipName("sheeppy");
		ship4.setShipId(1456700);
		System.out.println(ship4);
		
		
		
		
		System.out.println(ship.hashCode());
		System.out.println(ship1.hashCode());
		System.out.println(ship2.hashCode());
		System.out.println(ship3.hashCode());
		System.out.println(ship4.hashCode());
		
		System.out.println(ship.equals(ship4));

	}

}
