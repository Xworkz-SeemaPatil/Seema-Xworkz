package com.xworkz.coupon;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;

public class UpdateTester {
public static void main(String[] args) {
	CouponDAO dao=new CouponDAOImpl();
	dao.UpdateNameAndCodeById("Max12","Max", 1);
}
}
