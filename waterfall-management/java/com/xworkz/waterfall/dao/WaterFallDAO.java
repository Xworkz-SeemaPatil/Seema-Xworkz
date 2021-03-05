package com.xworkz.waterfall.dao;

import com.xworkz.waterfall.entity.WaterFallEntity;

public interface WaterFallDAO {
	public void create(WaterFallEntity entity);
	public WaterFallEntity updateHeightAndDeapthById(double height,double deapth,int id);
	public WaterFallEntity getById(int id);
	public void deleteById(int id);

}
