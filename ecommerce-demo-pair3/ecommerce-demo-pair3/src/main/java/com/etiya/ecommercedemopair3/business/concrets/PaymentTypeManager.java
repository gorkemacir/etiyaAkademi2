package com.etiya.ecommercedemopair3.business.concrets;

import com.etiya.ecommercedemopair3.business.abstracts.PaymentTypeService;
import com.etiya.ecommercedemopair3.entities.concrets.PaymentType;
import com.etiya.ecommercedemopair3.repository.abstracts.PaymentTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaymentTypeManager implements PaymentTypeService {
    private PaymentTypeRepository paymentTypeRepository;

    @Override
    public List<PaymentType> getAll() {
        return paymentTypeRepository.findAll();
    }

    @Override
    public PaymentType getById(int id) {
        return paymentTypeRepository.findById(id).orElseThrow();
    }

    @Override
    public PaymentType getByName(String name) {
        return paymentTypeRepository.findByName(name);
    }

    @Override
    public PaymentType getByDescription(String description) {
        return paymentTypeRepository.findPaymentTypeByDescription(description);
    }
}
