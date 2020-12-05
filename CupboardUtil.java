class CupboardUtil
{
	public static void main(String...a)
	{
		Cupboard cup= new Cupboard();
		cup.brandName="Godrej";
		cup.color="Brown";
		cup.noOfCupboards=19;
		System.out.println(cup.brandName);
		System.out.println(cup.color);
		System.out.println(cup.noOfCupboards);
		cup.locking();
		
		cup.unLocking();
	}
}