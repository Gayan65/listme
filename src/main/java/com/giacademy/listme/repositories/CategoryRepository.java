package com.giacademy.listme.repositories;

import com.giacademy.listme.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
