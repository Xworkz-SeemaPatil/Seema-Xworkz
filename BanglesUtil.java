class BanglesUtil
{
	public static void main(String...a)
	{
		Bangles bang= new Bangles();
		bang.name="Rajasthani Bangles";
		bang.color="Red";
		bang.price=200;
		System.out.println(bang.name);
		System.out.println(bang.color);
		System.out.println(bang.price);
		bang.toWear();
		
		bang.toMakeArt();
	}
}