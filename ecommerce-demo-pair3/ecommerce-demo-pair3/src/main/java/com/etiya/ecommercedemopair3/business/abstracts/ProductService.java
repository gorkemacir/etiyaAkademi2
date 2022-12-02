package com.etiya.ecommercedemopair3.business.abstracts;

import com.etiya.ecommercedemopair3.entities.concrets.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(int id);
}
