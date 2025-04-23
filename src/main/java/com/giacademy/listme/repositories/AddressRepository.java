package com.giacademy.listme.repositories;

import com.giacademy.listme.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
