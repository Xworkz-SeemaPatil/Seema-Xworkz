class WindowUtil
{
	public static void main(String...a)
	{
		Window win = new Window();
		win.size="18 inches";
		win.color="Blue";
		win.price=1000;
		System.out.println(win.size);
		System.out.println(win.color);
		System.out.println(win.price);
		win.givesLight();
		
		win.givesAir();
	}
}