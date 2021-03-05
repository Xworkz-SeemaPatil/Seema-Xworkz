package com.xworkz.bbkc.dao;

import com.xworkz.bbkc.entity.BBCEntity;

public interface BBCDAO {
	public void create(BBCEntity entity);
	public BBCEntity getById(int id);
	public BBCEntity updateDaysInAndNoOfTasksById(int id,int noOfTask,int DaysIn); 
	public void deleteById(int id); 
	public BBCEntity updateNameById(String name,int id);

}
