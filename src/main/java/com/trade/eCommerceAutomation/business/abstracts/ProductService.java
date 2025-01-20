package com.trade.eCommerceAutomation.business.abstracts;

import java.util.List;

import com.trade.eCommerceAutomation.entities.concretes.Product;

public interface ProductService {
    List<Product> getAll();
}
