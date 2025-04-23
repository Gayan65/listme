package com.giacademy.listme.repositories;

import com.giacademy.listme.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
