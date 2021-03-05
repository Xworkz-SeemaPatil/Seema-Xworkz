package com.xworkz.coupon;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class CreateTester {
		public static void main(String[] args) {
			
		CouponEntity entity = new CouponEntity();
		
		entity.setName("Ajio Coupn");
		entity.setType("Attire");;
		entity.setCode("Ajio1");
		entity.setValidityInMonth(12);

		CouponDAO dao=new CouponDAOImpl();
		dao.create(entity);
		}
	}


