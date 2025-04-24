package com.giacademy.listme.mappers;

import com.giacademy.listme.dto.ProductDto;
import com.giacademy.listme.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);
}
