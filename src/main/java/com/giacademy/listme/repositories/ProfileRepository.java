package com.giacademy.listme.repositories;

import com.giacademy.listme.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
