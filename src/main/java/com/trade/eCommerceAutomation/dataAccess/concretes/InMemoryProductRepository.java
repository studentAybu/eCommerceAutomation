package com.trade.eCommerceAutomation.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.trade.eCommerceAutomation.dataAccess.abstracts.ProductDao;
import com.trade.eCommerceAutomation.entities.concretes.Product;
@Repository
public class InMemoryProductRepository{
	
	List<Product> products;
	
	public InMemoryProductRepository() {
		products=new ArrayList<Product>();
		products.add(new Product(1, 4, "Tablet", 249.99, "Piece"));
		products.add(new Product(2, 2, "Wireless Mouse", 15.75, "Piece"));
		products.add(new Product(3, 6, "Webcam", 45.50, "Piece"));
		products.add(new Product(4, 5, "External Hard Drive", 59.90, "Piece"));
	}
	
	
	

//	@Override
//	public List<Product> findAll() {	
//		return products;
//	}

}
