package com.etiya.ecommercedemopair3.api.controllers;

import com.etiya.ecommercedemopair3.business.abstracts.PaymentTypeService;
import com.etiya.ecommercedemopair3.entities.concrets.Address;
import com.etiya.ecommercedemopair3.entities.concrets.PaymentType;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paymentTypes")
@AllArgsConstructor
public class PaymentTypeController{
    PaymentTypeService paymentTypeService;

    @GetMapping("/getAll")
    public List<PaymentType> getAll(){
        return paymentTypeService.getAll();
    }

    @GetMapping("{id}")
    public PaymentType getById(@PathVariable int id){
        return paymentTypeService.getById(id);
    }

    @GetMapping("/name")
    public PaymentType getByName(@RequestParam("name") String name){
        return paymentTypeService.getByName(name);
    }

    @GetMapping("/description")
    public PaymentType getByDescription(@RequestParam("description") String description){
        return paymentTypeService.getByDescription(description);
    }
}
