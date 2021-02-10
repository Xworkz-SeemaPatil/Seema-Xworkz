package com.xworkz.cosmetic.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	private List<CosmeticDTO> cosmetics;

	public CosmeticDAOImpl(List<CosmeticDTO> list) {
		this.cosmetics = new LinkedList<CosmeticDTO>();
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		// TODO Auto-generated method stub
		boolean added = false;
		boolean contains = this.cosmetics.contains(dto);
		if (!contains) {
			added = this.cosmetics.add(dto);
		}
		if (added)
			System.out.println("cosmetic added" + dto);
		else
			System.out.println("cosmetic not added");
		return added;
	}

	@Override
	public CosmeticDTO findbyQuantityAndBrand(int quantity, String brand) {
		// TODO Auto-generated method stub
		System.out.println("invoked findByquantityandbrad");
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO = cosmeticDTO.getBrand();
			int quantityFromDTO = cosmeticDTO.getQuantity();
			if (brandFromDTO.equals(brand) && quantityFromDTO == (quantity)) {
				System.out.println("cosmetic found");
				return cosmeticDTO;
			}
		}
		return null;
	}

	public CosmeticDTO findbyTypeAndBrand(CosmeticType cosmeticType, String brand) {
		// TODO Auto-generated method stub
		System.out.println("invoked findByquantityandbrad");
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO = cosmeticDTO.getBrand();
			CosmeticType cosmeticFromDTO = cosmeticDTO.getCosmeticType();
			if (brandFromDTO.equals(brand) && cosmeticFromDTO.equals(cosmeticType)) {
				System.out.println("cosmetic found");
				return cosmeticDTO;
			}
		}
		return null;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		// TODO Auto-generated method stub
		/*System.out.println("invoked updatePriceAndQuantityByBrand ");
		System.out.println("Quantity: " + quantity);
		System.out.println("Brand: " + brand);
		CosmeticDTO dtoFromCosmetic = this.findbyQuantityAndBrand(quantity, brand);
		if (dtoFromCosmetic != null) {
			System.out.println("can update , cosmetic is found");
			dtoFromCosmetic.setPrice(price);
			return true;
		} */
		Iterator<CosmeticDTO> iterator = this.cosmetics.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO dto = iterator.next();
			if (dto.getBrand().equals(brand)&& dto.getQuantity()==(quantity)) {
				System.out.println("cosmetic found");
				dto.setPrice(price);
				return true;
			}
		else {
			System.out.println("cannot update , cosmetic not found");
		}
		}
		return false;
	}

	@Override
	public boolean updatePriceByBrandandType(double price, String brand, CosmeticType cosmeticType) {
		/*
		 * System.out.println("invoked updatePriceAndQuantityByBrand ");
		 * System.out.println("type: " + cosmeticType); System.out.println("Brand: " +
		 * brand); CosmeticDTO dtoFromCosmetic = this.findbyTypeAndBrand(cosmeticType,
		 * brand); if (dtoFromCosmetic != null) {
		 * System.out.println("can update , cosmetic is found");
		 * dtoFromCosmetic.setPrice(price); return true; } else {
		 * System.out.println("cannot update , cosmetic not found"); }
		 */	
		Iterator<CosmeticDTO> iterator = this.cosmetics.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO dto = iterator.next();
			if (dto.getBrand().equals(brand)&&dto.getCosmeticType().equals(cosmeticType)) {
				System.out.println("cosmetic found");
				dto.setPrice(price);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateTypeByBrand(CosmeticType cosmeticType, String brand) {

		Iterator<CosmeticDTO> iterator = this.cosmetics.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO dto = iterator.next();
			if (dto.getBrand().equals(brand)) {
				System.out.println("cosmetic found");
				dto.setCosmeticType(cosmeticType);
				return true;
			}
			/*
			 * System.out.println("invoked updateTypeByBrand");
			 * System.out.println("Brand: "+brand); for (CosmeticDTO cosmeticDTO :
			 * this.cosmetics) { String brandFromDTO=cosmeticDTO.getBrand(); if
			 * (brandFromDTO.equals(brand)) { System.out.println("cosmetic found");
			 * cosmeticDTO.setCosmeticType(cosmeticType); return true; }
			 */ else {
				System.out.println("cannot update , cosmetic not found");
			}
		}
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		Iterator<CosmeticDTO> iterator = this.cosmetics.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO dto = iterator.next();
			if (dto.getBrand().equals(brand)) {
				iterator.remove();
				return true;
			}
		}
		/*
		 * for (CosmeticDTO cosDTO : this.cosmetics) { String brandFromDTO =
		 * cosDTO.getBrand(); if ( brandFromDTO.equals(brand) ) {
		 * this.cosmetics.remove(cosDTO); System.out.println("deleted"); return true;
		 * 
		 * } }
		 */
		return false;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		// cosmetics.removeAll(cosmetics);
		this.cosmetics.clear();

	}

	@Override
	public List<CosmeticDTO> getAll() {
		/*
		 * for (CosmeticDTO cosmeticDTO : this.cosmetics) {
		 * System.out.println(cosmeticDTO.getBrand()+" "+cosmeticDTO.getPrice()+" "
		 * +cosmeticDTO.getQuantity()+" "+cosmeticDTO.getCosmeticShade()+" "+cosmeticDTO
		 * .getCosmeticType()); }
		 */
		return this.cosmetics;

	}

	@Override
	public int totalSize() {
		return this.cosmetics.size();

	}

}