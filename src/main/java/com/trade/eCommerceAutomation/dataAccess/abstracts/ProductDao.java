package com.trade.eCommerceAutomation.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trade.eCommerceAutomation.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{

}