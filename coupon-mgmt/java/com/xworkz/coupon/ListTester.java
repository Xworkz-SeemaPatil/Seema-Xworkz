package com.xworkz.coupon;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class ListTester {
	public static void main(String[] args) {
		CouponEntity entity=new CouponEntity();
		entity.setName("Myntra123");
		entity.setType("Bag");
		entity.setCode("Myntra");
		entity.setValidityInMonth(5);
		
		CouponEntity entity1=new CouponEntity("FoodCarnival", "Food", "FoodCarnival1",2);
		
		CouponEntity entity2=new CouponEntity("filpcart", "clothes", "diwali123",4);
		
		CouponEntity entity3=new CouponEntity("amazon", "jeans", "amazon12",5);
		CouponEntity entity4=new CouponEntity("snadeal", "ring", "snapdeal123",5);
		
		
		CouponDAO dao = new CouponDAOImpl();
		List<CouponEntity> entities= new ArrayList<CouponEntity>();
		entities.add(entity);
		entities.add(entity1);
		entities.add(entity2);
		entities.add(entity3);
		entities.add(entity4);
		dao.create(entities);
	}

}
