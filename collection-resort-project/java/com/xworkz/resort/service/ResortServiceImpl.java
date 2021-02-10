package com.xworkz.resort.service;

import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {
	private ResortDAO resortDao;
	String specialchar= "[^<>\"/; %]*$";
	public ResortServiceImpl(ResortDAO resortDAO) {
	System.out.println("invokes Resort Service Impl");
		this.resortDao = resortDAO;
	}
	@Override
	public boolean validateDataAndSave(ResortDTO dto) {
		boolean validData = false;
		if (dto != null) {
		System.out.println("dto is not null, can save fields");
		String location = dto.getLocation();
		if (location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
		&& !location.contains(" ")&& !location.contains(specialchar)) {
		System.out.println("location is valid");
		validData = true;
		}
		else {
		System.out.println("location is not valid"); 
		validData = false;
		}
		
		if(validData) {
			String name=dto.getName();
			if(name !=null && name.length()>=3 && name.length()<=15 && !name.isEmpty() && !name.contains(" ")) {
				System.out.println("name is valid");
			validData = true;
		}
		else {
		System.out.println("name is not valid"); 
		validData = false;
		}
		}
		
		if(validData) {
			double pricePerHead=dto.getPricePerHead();
			if(pricePerHead >=999 && pricePerHead <=2500) {
					System.out.println("pricePerHead is valid");
			validData = true;
			}
		else {
		System.out.println("pricePerHead is not valid"); 
		validData = false;
		}
		}

		if(validData) {
			float rating=dto.getRating();
			if(rating >=0 && rating<=5) {
					System.out.println("rating is valid");
			validData = true;
			}
		else {
		System.out.println("rating is not valid"); 
		validData = false;
		}
		}
		
		if(validData) {
			float phoneNO=dto.getPhoneNO();
			/*
			 * if() { System.out.println("phoneNO is valid"); validData = true; } else {
			 * System.out.println("phoneNO is not valid"); validData = false; }
			 */
		}
		
		if(validData) {
			float noOfEmployees=dto.getNoOfEmployees();
			if(noOfEmployees >=5 && noOfEmployees<=25) {
					System.out.println("noOfEmployees is valid");
			validData = true;
			}
		else {
		System.out.println("noOfEmployees is not valid"); 
		validData = false;
		}
		}
		
		if(validData) {
			boolean poolExist=dto.isPoolExist();
			if(poolExist==false) {
					System.out.println("poolExist is valid");
			validData = true;
			}
		else {
		System.out.println("poolExist is not valid"); 
		validData = false;
		}
		}
		
		if(validData) {
			System.out.println("all data is valid");
			this.resortDao.save(dto);
		}
		}
	else {
		System.out.println("dto is not valid cannot save");
	}
		
		return false;
	}
		
	@Override
	public boolean validateUpdateLocationByName(String location, String name) {
		System.out.println("invoke validateUpdateLocationByName");
		if (location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
		&& !location.contains(" ")&& !location.contains(specialchar)
		&& name !=null && name.length()>=3 && name.length()<=15 && !name.isEmpty() && !name.contains(" ")) {
			this.resortDao.updateLocationByName(location, name);
		System.out.println("location and name is valid");
		}
		else {
		System.out.println("location and name is not valid"); 
		}
	
		return false;
	}
	
	@Override
	public boolean validateUpdateLocationByNameAndRating(String location, String name, float rating) {
		System.out.println("invoke validateUpdateLocationByNameAndRating");
		if (location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
		&& !location.contains(" ")&& !location.contains(specialchar)&&name !=null && name.length()>=3 && 
		name.length()<=15 && !name.isEmpty() && !name.contains(" ") && rating >=0 && rating<=5) {
			this.resortDao.updateLocationByNameAndRating(location, name, rating);
		System.out.println("location, name and rating is valid");
		}
		else {
		System.out.println("location, name and rating is invalid"); 
		}
		return false;
	}
	@Override
	public boolean validateDeleteByNameAndLocation(String name, String location) {
		
		System.out.println("invoke validateDeleteByNameAndLocation");
		if (location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
		&& !location.contains(" ")&& !location.contains(specialchar) && name !=null && name.length()>=3
		&& name.length()<=15 && !name.isEmpty() && !name.contains(" ")) {
			this.resortDao.deleteByNameAndLocation(name, location);
		System.out.println("location and name is valid");
		}
		else {
		System.out.println("location and name invalid"); 
		}
		return false;
	}
	
	@Override
	public int validateTotalResortSize() {
		return this.resortDao.totalResortSize();
	}
	@Override
	public List<ResortDTO> validateGetAll() {
		return this.resortDao.getAll();
	}
	@Override
	public boolean validateAddMultipleResorts(List<ResortDTO> dtos) {
		// TODO Auto-generated method stub
		return false;
	}
}