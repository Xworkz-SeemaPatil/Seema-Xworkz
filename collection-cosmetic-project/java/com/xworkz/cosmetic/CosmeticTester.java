package com.xworkz.cosmetic;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;

public class CosmeticTester {
	
	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO=new CosmeticDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setCosmeticType(CosmeticType.CONSEALER);
		cosmeticDTO.setPrice(300);
		cosmeticDTO.setQuantity(20);
		cosmeticDTO.setCosmeticShade(CosmeticShade.BLUE);
		
		
		CosmeticDAOImpl dao=new CosmeticDAOImpl(null);
		dao.save(cosmeticDTO);
		
		CosmeticDTO cosmeticDTO2=new CosmeticDTO(30,"Lakme",400.00,CosmeticType.FOUNDATION,CosmeticShade.RED);
		dao.save(cosmeticDTO2);
		
		CosmeticDTO cosmeticDTO3=new CosmeticDTO(40,"Nyka",500.00,CosmeticType.PRIMER,CosmeticShade.ORANGE);
		dao.save(cosmeticDTO3);
		
		
		  System.out.println(cosmeticDTO3);
		  boolean updated=dao.updatePriceAndQuantityByBrand(50000.00, 40, "Nyka");
		  System.out.println("updated "+ updated); 
		  System.out.println(cosmeticDTO3);
		  
		  System.out.println(cosmeticDTO2);
		  boolean updated1=dao.updatePriceByBrandandType(600000, "Lakme",CosmeticType.FOUNDATION); 
		  System.out.println("updated "+ updated1);
		  System.out.println(cosmeticDTO2);
		  
		  List<CosmeticDTO> get1=dao.getAll();
		  System.out.println("getting all the elements"+get1);
		  
		  System.out.println(cosmeticDTO);
		  
		  int total1=dao.totalSize(); System.out.println("total size"+total1);
		  
		  boolean update2=dao.updateTypeByBrand(CosmeticType.PRIMER, "Maybelline");
		  System.out.println("updated "+ update2);
		  System.out.println(cosmeticDTO);
		  
		  boolean delete=dao.deleteByBrand("Nyka"); System.out.println("deleted"+
		  delete); int total2=dao.totalSize(); System.out.println("total size"+total2);
		  
		  
		  dao.deleteAll();
		  
		  List<CosmeticDTO> get=dao.getAll(); System.out.println(get);
		  
		  int total=dao.totalSize(); System.out.println("total size"+total);
		  
			/*
			 * List<CosmeticDTO> cosmeticDTOs=new ArrayList<CosmeticDTO>();
			 * 
			 * cosmeticDTOs.add(cosmeticDTO); cosmeticDTOs.add(cosmeticDTO2);
			 * cosmeticDTOs.add(cosmeticDTO3);
			 * 
			 * for (CosmeticDTO cosmeticDTO4 : cosmeticDTOs) {
			 * System.out.println(cosmeticDTO4.getBrand()); }
			 * 
			 * //Collections.sort(cosmeticDTO);
			 * 
			 * for (CosmeticDTO cosmeticDTO4 : cosmeticDTOs) {
			 * System.out.println(cosmeticDTO4.getBrand());
			 * 
			 * }
			 */

	}
}