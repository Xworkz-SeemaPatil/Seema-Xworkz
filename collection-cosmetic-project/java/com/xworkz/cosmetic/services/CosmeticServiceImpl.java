package com.xworkz.cosmetic.services;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService {
	
	private CosmeticDAO cosmeticDAO;
   // private String company;

	public CosmeticServiceImpl(CosmeticDAO cosmeticDAO) {
		System.out.println("Created CosmeticServiceImpl");
		this.cosmeticDAO = cosmeticDAO;
		// this.company=company;
	}

	@Override
	public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData=false;
		if(cosmeticDTO !=null) {
			System.out.println("dto is not null, will validate fields");
			String brand = cosmeticDTO.getBrand();
			if(brand != null && brand.length()>=3 && !brand.isEmpty() && !brand.equals(" ")) {
				System.out.println("brand is valid");
				validData=true;
			}
			else {
				System.out.println("brand is invalid");
				validData=false;
			}
			
		if(validData) {
			CosmeticType type=cosmeticDTO.getCosmeticType();
			if(type != null) {
				System.out.println("CosmeticType is valid");
				validData=true;
			}
			else {
				System.out.println("CosmeticType is invalid");
				validData=false;
			}
		}
		
		if(validData) {
			CosmeticShade shade=cosmeticDTO.getCosmeticShade();
			if(shade != null) {
				System.out.println("Cosmeticshade is valid");
				validData=true;
			}
			else {
				System.out.println("Cosmeticshade is invalid");
				validData=false;
			}
		}
			
		if(validData) {
			double price=cosmeticDTO.getPrice();
			if(price > 0) {
				System.out.println("price is valid");
				validData=true;
			}
			else {
				System.out.println("price is invalid");
				validData=false;
			}
		}
		
		if(validData) {
			int quantity=cosmeticDTO.getQuantity();
			if(quantity > 0 && quantity <=100) {
				System.out.println("quantity is valid");
				validData=true;
			}
			else {
				System.out.println("quantity is invalid");
				validData=false;
			}
		}
		
		if(validData) {
			System.out.println("data is valid, can invoke dao");
			//CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
			cosmeticDAO.save(cosmeticDTO);
			
		}
		else {
			System.out.println("dto is null, invalid data");
		}
		}
		return false;
	}
	
	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		if (brand != null && !brand.isEmpty() && !brand.contains(" ") && brand.length() >= 3) {
			System.out.println("brand is valid, can delete" + brand);
			this.cosmeticDAO.deleteByBrand(brand);
		} else {
			System.out.println("invalid brand");
		}

	}
	
	@Override
	public int cosmeticsSize() {
		return this.cosmeticDAO.totalSize();
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		// TODO Auto-generated method stub
		boolean validData=false;
			if(brand != null && brand.length()>=3 && !brand.isEmpty() && !brand.equals(" ")) {
				System.out.println("brand is valid");
				validData=true;
			}
			else {
				System.out.println("brand is invalid");
				validData=false;
			}
		if(validData) {
			if(price > 0) {
				System.out.println("price is valid");
				validData=true;
			}
			else {
				System.out.println("price is invalid");
				validData=false;
			}
		}
		
		if(validData) {
			if(quantity > 0 && quantity <=100) {
				System.out.println("quantity is valid");
				validData=true;
			}
			else {
				System.out.println("quantity is invalid");
				validData=false;
			}
			
			if(validData) {
				System.out.println("data is valid, can invoke dao");
				//CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
				cosmeticDAO.updatePriceAndQuantityByBrand(price, quantity, brand);
				
			}
			else {
				System.out.println("dto is null, invalid data");
			}
		}
		
		return false;
	}

	@Override
	public boolean updatePriceByBrandandType(double price, String brand, CosmeticType cosmeticType) {
		boolean validData=false;
		if(brand != null && brand.length()>=3 && !brand.isEmpty() && !brand.equals(" ")) {
			System.out.println("brand is valid");
			validData=true;
		}
		else {
			System.out.println("brand is invalid");
			validData=false;
		}
	if(validData) {
		if(price > 0) {
			System.out.println("price is valid");
			validData=true;
		}
		else {
			System.out.println("price is invalid");
			validData=false;
		}
	}
		
		if(validData) {
			if( cosmeticType != null) {
				System.out.println("CosmeticType is valid");
				validData=true;
			}
			else {
				System.out.println("CosmeticType is invalid");
				validData=false;
			}
		}
		if(validData) {
			System.out.println("data is valid, can invoke dao");
			//CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
			cosmeticDAO.updatePriceByBrandandType(price, brand,cosmeticType);
				
		}
		else {
			System.out.println("dto is null, invalid data");
		}
	
		return false;
	}


	@Override
	public boolean updateTypeByBrand(CosmeticType cosmeticType, String brand) {
		// TODO Auto-generated method stub
		boolean validData=false;
		if(brand != null && brand.length()>=3 && !brand.isEmpty() && !brand.equals(" ")) {
			System.out.println("brand is valid");
			validData=true;
		}
		else {
			System.out.println("brand is invalid");
			validData=false;
		}
		if(validData) {
			if( cosmeticType != null) {
				System.out.println("CosmeticType is valid");
				validData=true;
			}
			else {
				System.out.println("CosmeticType is invalid");
				validData=false;
			}
		}
		if(validData) {
			System.out.println("data is valid, can invoke dao");
			//CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
			cosmeticDAO.updateTypeByBrand(cosmeticType,brand);
				
		}
		else {
			System.out.println("dto is null, invalid data");
		}
		
		return false;
	}	
}
