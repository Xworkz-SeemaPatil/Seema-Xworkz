package com.xworkz.instagram.dao;

import java.util.List;

import com.xworkz.instagram.entity.InstaEntity;

public interface InstaDAO {
	public void create(InstaEntity entity);
	public InstaEntity getById(int id);
	public void UpdateUserNameAndNameById(String usrName, String name, int id);
	public void deleteById(int id);
	public void create(List<InstaEntity> entities);
			
}
