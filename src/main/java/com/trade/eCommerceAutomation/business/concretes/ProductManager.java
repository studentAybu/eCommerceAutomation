package com.trade.eCommerceAutomation.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.eCommerceAutomation.business.abstracts.ProductService;
import com.trade.eCommerceAutomation.dataAccess.abstracts.ProductDao;
import com.trade.eCommerceAutomation.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}
}
