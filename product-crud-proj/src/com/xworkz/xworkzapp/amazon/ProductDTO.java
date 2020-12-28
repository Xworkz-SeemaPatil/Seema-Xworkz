package com.xworkz.xworkzapp.amazon;

public class ProductDTO {
	
	
	private int productId;
	private String ProductName;
	private String Categories;
	private double price;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId=productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getCategories() {
		return Categories;
	}
	public void setCategories(String categories) {
		Categories = categories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
