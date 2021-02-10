package com.xworkz.cosmetic.dto;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;

public class CosmeticDTO {
	private int quantity;
	private String brand;
	private double price;
	private CosmeticType cosmeticType;
	private CosmeticShade cosmeticShade;
	
	public CosmeticDTO() {
		// TODO Auto-generated constructor stub
	}

	public CosmeticDTO(int quantity, String brand, double price, CosmeticType cosmeticType,
			CosmeticShade cosmeticShade) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		this.cosmeticType = cosmeticType;
		this.cosmeticShade = cosmeticShade;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [quantity=" + quantity + ", brand=" + brand + ", price=" + price + ", cosmeticType="
				+ cosmeticType + ", cosmeticShade=" + cosmeticShade + "]";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CosmeticType getCosmeticType() {
		return cosmeticType;
	}

	public void setCosmeticType(CosmeticType cosmeticType) {
		this.cosmeticType = cosmeticType;
	}

	public CosmeticShade getCosmeticShade() {
		return cosmeticShade;
	}

	public void setCosmeticShade(CosmeticShade cosmeticShade) {
		this.cosmeticShade = cosmeticShade;
	}

	
	  @Override public boolean equals(Object obj) { 
	  if(obj == null)
			 return false;
	  if(obj instanceof CosmeticDTO) {
	  
	  CosmeticDTO casted=(CosmeticDTO) obj; 
	  if(this.brand != null && this.cosmeticType !=null) { 
	  if(this.brand.equals(casted.getBrand()) && this.cosmeticType.equals(casted.getCosmeticType())) {
	  System.out.println("CosmeticDTO is equal");
	  return true; 
	  }
		  }
	  System.out.println("CosmeticDTO is not equal");
	  }
	  return false; 
	  }
	 
}
