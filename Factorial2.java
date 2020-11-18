class Factorial2{
	public static void main(String...a)
	{
	myFact(89);
	}
	
	static void myFact(double n)
	{
	double fact=1;
	for (int i=1;i<=n; i++)
		{
	fact = fact*i;
		}
		System.out.println(fact);
	}
}