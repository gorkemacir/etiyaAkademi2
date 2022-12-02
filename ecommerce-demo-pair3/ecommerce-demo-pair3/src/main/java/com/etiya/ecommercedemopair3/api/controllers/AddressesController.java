package com.etiya.ecommercedemopair3.api.controllers;

import com.etiya.ecommercedemopair3.business.abstracts.AddressService;
import com.etiya.ecommercedemopair3.entities.concrets.Address;
import com.etiya.ecommercedemopair3.entities.concrets.Product;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Addresses")
@AllArgsConstructor
public class AddressesController {

    AddressService addressService;

    @GetMapping("/getAll")
    public List<Address> getAll(){
        return addressService.getAll();
    }

    @GetMapping("{id}")
    public Address getById(@PathVariable int id){
        return addressService.getById(id);
    }

    @GetMapping("/title")
    public List<Address> getAllAddressByTitle(@RequestParam("title") String title){return addressService.getAllAddressByTitle(title);}
    @GetMapping("/description")
    public Address findByDescription(@RequestParam("description") String description){return addressService.findByDescription(description);}

}
