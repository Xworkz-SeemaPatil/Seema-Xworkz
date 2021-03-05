package com.xworkz.coupon.dao;

import java.util.List;

import com.xworkz.coupon.entity.CouponEntity;

public interface CouponDAO {
	public void create(CouponEntity entity);
	public CouponEntity getById(int id);
	public void UpdateNameAndCodeById(String code, String name, int id);
	public void deleteById(int id);
	public void create(List<CouponEntity> entities);
	
	
}
