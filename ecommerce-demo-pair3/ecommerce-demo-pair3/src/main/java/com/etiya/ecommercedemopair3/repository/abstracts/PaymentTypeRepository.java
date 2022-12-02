package com.etiya.ecommercedemopair3.repository.abstracts;

import com.etiya.ecommercedemopair3.entities.concrets.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PaymentTypeRepository extends JpaRepository<PaymentType,Integer> {
    @Query("Select pt from PaymentType as pt where name=:name")
    PaymentType findByName(String name);

    PaymentType findPaymentTypeByDescription(String description);
}
