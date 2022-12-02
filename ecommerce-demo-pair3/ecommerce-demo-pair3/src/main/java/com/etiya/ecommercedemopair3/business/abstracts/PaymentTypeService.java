package com.etiya.ecommercedemopair3.business.abstracts;

import com.etiya.ecommercedemopair3.entities.concrets.PaymentType;
import com.etiya.ecommercedemopair3.entities.concrets.Product;

import java.util.List;

public interface PaymentTypeService {
    List<PaymentType> getAll();
    PaymentType getById(int id);
    PaymentType getByName(String name);
    PaymentType getByDescription(String description);
}
