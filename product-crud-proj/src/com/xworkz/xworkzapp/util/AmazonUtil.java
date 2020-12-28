package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.amazon.ProductDTO;
import com.xworkz.xworkzapp.amazon.ProductOperation;

public class AmazonUtil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of product");
		int size = sc.nextInt();
		ProductOperation operation = new ProductOperation(size);

		    for (int i = 0; i < size; i++) {
			ProductDTO dto = new ProductDTO();
			System.out.println("Enter the" + " " + (i + 1) + " " + "product Details");
			System.out.println("Enter the product id");
			int productId = sc.nextInt();
			System.out.println("Enter the product name");
			String productName = sc.next();
			System.out.println("Enter the Categories");
			String categoires = sc.next();
			System.out.println("Enter the price");
			double price = sc.nextDouble();

			dto.setProductId(productId);
			dto.setProductName(productName);
			dto.setCategories(categoires);
			dto.setPrice(price);

			operation.addProductDetails(dto);
		}
		sc.close();
		operation.displayAllProductDetails();
	}
}