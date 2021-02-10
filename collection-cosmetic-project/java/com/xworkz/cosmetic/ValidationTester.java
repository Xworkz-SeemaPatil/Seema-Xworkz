package com.xworkz.cosmetic;

import java.util.LinkedList;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.services.CosmeticService;
import com.xworkz.cosmetic.services.CosmeticServiceImpl;

public class ValidationTester {
	public static void main(String[] args) {
	
	CosmeticDTO cosmeticDTO=new CosmeticDTO();
	cosmeticDTO.setCosmeticType(CosmeticType.CONSEALER);
	cosmeticDTO.setPrice(1000);
	cosmeticDTO.setCosmeticShade(CosmeticShade.BLUE);
	cosmeticDTO.setBrand("MAC");
	cosmeticDTO.setQuantity(50);
	
	List<CosmeticDTO> list=new LinkedList<CosmeticDTO>();
	
	CosmeticDAO dao=new CosmeticDAOImpl(list);
	CosmeticService service=new CosmeticServiceImpl(dao);
	
	service.validateAndSave(cosmeticDTO);
	
	CosmeticDTO cosmeticDTO2=new CosmeticDTO(10,"Sugr",1000 ,CosmeticType.PRIMER,CosmeticShade.BLUE);
	
	service.validateAndSave(cosmeticDTO2);
	System.out.println(service.cosmeticsSize());

	service.updatePriceAndQuantityByBrand(5000, 10,"Sugr");
	service.updatePriceByBrandandType(6000, "MAC", CosmeticType.CONSEALER);
	service.updateTypeByBrand(CosmeticType.PRIMER, "MAC");
	List<CosmeticDTO> list1=dao.getAll();
	System.out.println(list1);
	service.deleteByBrand("Sugr");
	//System.out.println(service.cosmeticDTO2);
	System.out.println(service.cosmeticsSize());
	
	}
}