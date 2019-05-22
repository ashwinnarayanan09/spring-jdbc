package com.example.controller;


import com.example.domain.AddressEntity;
import com.example.service.AddressService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/addressess")

public class AddressController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(AddressController.class);
    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService){

        this.addressService = addressService;
    }


    @GetMapping
    public ResponseEntity<List<AddressEntity>> readAllAddresses() {

        log.info("readAllAddresses()");

        List<AddressEntity> addressList = addressService.readAllAddresses();

        return ResponseEntity.ok(addressList);
    }
}
