package com.giacademy.listme.mappers;

import com.giacademy.listme.dto.RegisterUserRequest;
import com.giacademy.listme.dto.UserDto;
import com.giacademy.listme.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
}


