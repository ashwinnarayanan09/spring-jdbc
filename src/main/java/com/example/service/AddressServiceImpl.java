package com.example.service;


import com.example.domain.AddressEntity;
import com.example.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {


    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository){

        this.addressRepository = addressRepository;
    }

    @Override
    public List<AddressEntity> readAllAddresses() {

        List<AddressEntity> addressEntityList = addressRepository.findAll();

        return addressEntityList;
    }
}
