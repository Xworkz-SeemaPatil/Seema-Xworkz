class Everything{
	public static void main(String...tt){
		for(int thing=0; thing<=tt.length-1;thing++)
		{
			short every=Short.parseShort(tt[thing]);
			System.out.println(every);
		}
	}
}