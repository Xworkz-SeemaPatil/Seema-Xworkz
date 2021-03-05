package com.xworkz.rich;

import com.xworkz.rich.dao.RichDAO;
import com.xworkz.rich.dao.RichDAOImpl;
import com.xworkz.rich.entity.RichEntity;

public class Util {
public static void main(String[] args) {
	RichEntity rich =new RichEntity();
	
	rich.setId(3);
	rich.setName("Ratan TATA");
	rich.setNetWorthInBillion(126);
	rich.setMarried(true);
	rich.setRank(2);
	rich.setCountry("INDIA");
	rich.setBusiness("Software");
	
	RichDAO dao=new RichDAOImpl();
	dao.create(rich);
	System.out.println("created sucessfully");
	
}
}
