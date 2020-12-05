class MaskUtil
{
	public static void main(String...a)
	{
		Mask mas= new Mask();
		mas.brandName="Ramraj";
		mas.color="Black";
		mas.price=100;
		System.out.println(mas.brandName);
		System.out.println(mas.color);
		System.out.println(mas.price);
		mas.forProtection();
		
		mas.hidingFace();
	}
}