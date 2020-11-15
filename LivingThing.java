class LivingThing{
	public static void main(String...tt){
		for(int thing=0; thing<=tt.length-1;thing++)
		{
			byte live=Byte.parseByte(tt[thing]);
			System.out.println(live);
		}
	}
}