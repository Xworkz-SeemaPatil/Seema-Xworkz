package com.xworkz.xworkzapp.paragliding;


public class ParaTester {
	public static void main(String[] args) {
		
	Paragliding para=new Paragliding();
	para.setPlace("sikim");
	para.setHeight(10000);
	System.out.println(para);
	
	Paragliding para1=new Paragliding();
	para1.setPlace("pune");
	para1.setHeight(1045678);
	System.out.println(para1);
	
	Paragliding para2=new Paragliding();
	para2.setPlace("paris");
	para2.setHeight(10000);
	System.out.println(para2);
	
	Paragliding para3=new Paragliding();
	para.setPlace("new york");
	para.setHeight(134567);
	System.out.println(para3);
	
	Paragliding para4=new Paragliding();
	para.setPlace("kashmir");
	para.setHeight(145678);
	System.out.println(para4);
	
	
	System.out.println(para.hashCode());
	System.out.println(para1.hashCode());
	System.out.println(para2.hashCode());
	System.out.println(para3.hashCode());
	System.out.println(para4.hashCode());
	
	System.out.println(para.equals(para2));


}

}
