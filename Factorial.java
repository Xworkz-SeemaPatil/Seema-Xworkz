class Factorial{
	public static void main(String...a)
	{
	int f=myFact(7);
	int g=myFact(4);
	int r=myFact(3);
	
	
		int finalvalue= f/(g*r);
		System.out.println(finalvalue);
		
		
		double total=Avg.avg(92.4,92.3,34.6);
		System.out.println(total);
	}
	
	static int myFact(int n)
	{
	int fact=1;
	for (int i=1;i<=n; i++)
		{
	fact = fact*i;
		}
	return fact;
		}
		

}
	