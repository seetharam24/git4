package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.entity.Address;
import com.example.entity.AddressKey;

@Component
public interface AddressRepo extends JpaRepository<Address, AddressKey> {

}
