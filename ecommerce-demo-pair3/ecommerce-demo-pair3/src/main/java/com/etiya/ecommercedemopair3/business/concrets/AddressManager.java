package com.etiya.ecommercedemopair3.business.concrets;

import com.etiya.ecommercedemopair3.business.abstracts.AddressService;
import com.etiya.ecommercedemopair3.entities.concrets.Address;
import com.etiya.ecommercedemopair3.repository.abstracts.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class AddressManager implements AddressService {
   private AddressRepository addressRepository;

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address getById(int id) {
        return addressRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Address> getAllAddressByTitle(String title) {
        return addressRepository.findAllAddressByTitle(title);
    }

    @Override
    public Address findByDescription(String description) {
        return addressRepository.findByDescription(description);
    }

}
