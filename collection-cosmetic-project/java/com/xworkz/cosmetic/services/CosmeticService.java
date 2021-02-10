package com.xworkz.cosmetic.services;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticService {
public boolean validateAndSave(CosmeticDTO cosmeticDTO);

boolean updatePriceAndQuantityByBrand(double price,int quantity,String brand);

boolean updatePriceByBrandandType(double price,String brand,CosmeticType cosmeticType);

boolean updateTypeByBrand(CosmeticType cosmeticType,String brand);

void deleteByBrand(String brand);
int cosmeticsSize();


}
