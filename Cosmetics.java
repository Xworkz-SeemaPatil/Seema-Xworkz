class Cosmetics
{
	double price;
	String name;
	String color;
	String brand;
	int cosmeticId;
	
	void makeOver()
	{
	System.out.println("party");
	}
	
	public static void main(String...a)
	{
		Cosmetics cos = new Cosmetics();
		cos.price=150.00;
		cos.name="Garnier white";
		cos.brand="godrej";
		cos.color="white";
		cos.cosmeticId=456;
		System.out.println(cos.price +""+cos.name);
		cos.makeOver();
		
	}

}

	
