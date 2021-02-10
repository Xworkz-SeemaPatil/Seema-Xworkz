package com.xworkz.cosmetic.dao;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO {
	boolean save(CosmeticDTO dto);
	
	CosmeticDTO findbyQuantityAndBrand(int quantity,String brand);
	
	boolean updatePriceAndQuantityByBrand(double price,int quantity,String brand);
	
	boolean updatePriceByBrandandType(double price,String brand,CosmeticType cosmeticType);
	
	boolean updateTypeByBrand(CosmeticType cosmeticType,String brand);
	
	boolean deleteByBrand(String brand);
	
	void deleteAll();
	
	List<CosmeticDTO> getAll();
	
	int totalSize();

	
	
}
