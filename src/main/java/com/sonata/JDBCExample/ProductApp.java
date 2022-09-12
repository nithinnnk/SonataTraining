package com.sonata.JDBCExample;

import com.sonata.DAOImpl.ProductImpl;

import com.sonata.EModel.Product;

public class ProductApp {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		// Product - 1
		p1.setProductID(1);
		p1.setProductName("Chocolate");
		p1.setProductPrice(50.00);
		// Product - 2
		p2.setProductID(2);
		p2.setProductName("Iphone");
		p2.setProductPrice(50000.00);
		// Product - 3
		p3.setProductID(3);
		p3.setProductName("table");
		p3.setProductPrice(25000.00);
		
		
		ProductImpl pImpl = new ProductImpl();
		
		// Adding Products to Database
		System.out.println(pImpl.addProduct(p1));
		System.out.println(pImpl.addProduct(p2));
		System.out.println(pImpl.addProduct(p3));
		pImpl.displayProduct();	// Display 'product' Table
		System.out.println("\n");
		
		// Deleting Product - 1
		System.out.println(pImpl.deleteProduct(p1));
		pImpl.displayProduct();	// Display 'product' Table
		System.out.println("\n");
		
		// Updating Product - 2
				System.out.println(pImpl.updateProduct(p2));
				pImpl.displayProduct();	// Display 'product' Table
				System.out.println("\n");
				
		
		
	
	}
}
	