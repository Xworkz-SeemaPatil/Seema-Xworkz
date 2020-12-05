class BackpacksUtil
{
	public static void main(String...a)
	{
		Backpacks bag= new Backpacks();
		bag.brandName="Skybags";
		bag.color="Orange";
		bag.price=1900;
		System.out.println(bag.brandName);
		System.out.println(bag.color);
		System.out.println(bag.price);
		bag.toKeepLaptop();
		
		bag.toKeepThings();
	}
}