class EvenOrOddd{
	public static void main (String...a)
	{
	isEven(22);
	isEven(27);//method calling
	
	}
	//called method which is parameterised
	static void isEven(int nmber)
	{
	if (nmber % 2 != 0)
		System.out.println(nmber + " is Odd");
	else
		System.out.println(nmber + " is even");
		
	}
}