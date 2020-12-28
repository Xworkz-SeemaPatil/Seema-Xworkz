package com.xworkz.xworkzapp.amazon;


public class ProductOperation {
	public ProductDTO[] productDTOs;
	public int index;
	
	public ProductOperation(int size) {
		productDTOs = new ProductDTO[size];
	}
	
	public void addProductDetails(ProductDTO product) {
		System.out.println("adding product Details");
		productDTOs[index++] = product;
		System.out.println("added product Details");		
	}
	
	public void displayAllProductDetails() {
		for (ProductDTO amazonDTO : productDTOs) {
			if(amazonDTO != null) {
				System.out.println(amazonDTO.getProductId() + " "+amazonDTO.getProductName()+" "+amazonDTO.getCategories()+" "+amazonDTO.getPrice());
			}
			else {
				System.out.println("please Add product Details");
			}
		}
	}
}
