package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterFallDAO;
import com.xworkz.waterfall.dao.WaterFallDAOImpl;
import com.xworkz.waterfall.entity.WaterFallEntity;
import com.xworkz.waterfall.util.SessionFactoryUtil;

public class TesterSessionFactory {
	public TesterSessionFactory() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//SessionFactoryUtil.getFactory();
		WaterFallEntity entity = new WaterFallEntity();
		//entity.setWId(1);
		entity.setName("nigara falls");
		entity.setDepth(67);
		entity.setDestination("arabic sea");
		entity.setElectricityGenerated(true);
		entity.setEntryFees(100);
		entity.setHeight(134);
		entity.setNoOfDeath(21);
		entity.setNoOfVisitors(10000);
		entity.setRating(3);
		entity.setLocation("some place");
		entity.setSourceRiver("dont know");
		
		WaterFallDAO dao=new WaterFallDAOImpl();
		dao.create(entity);
		
	}

}
