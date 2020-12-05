class Cosmetic
{
	static double price;
	static String name;
	static String color;
	static String brand;
	static int cosmeticId;
	
	void makeOver()
	{
	System.out.println("party");
	}
	
	public static void main(String...a)
	{
		Cosmetic.price=6789.00;
		System.out.println(price);
		Cosmetic cos = new Cosmetic();
		cos.price=150.00;
		cos.name="Garnier white";
		cos.brand="godrej";
		cos.color="white";
		cos.cosmeticId=456;
		System.out.println(cos.price +" "+cos.name);
		cos.makeOver();
		
	}

}

	
