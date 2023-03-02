package com.example.Fitnes.service.api;

import com.example.Fitnes.core.dto.users.UserCreateDTO;
import com.example.Fitnes.core.dto.users.UserLoginDTO;
import com.example.Fitnes.core.dto.users.UserRegistrationDTO;
import com.example.Fitnes.dao.entity.UserEntity;

import java.util.List;
import java.util.UUID;

public interface IUserService {
    List<UserEntity> getAll();
    boolean save(UserRegistrationDTO userRegistrationDTO);
    UserCreateDTO getCard(UUID uuid);
    boolean verification(String verificationCode, String mail);
    UserLoginDTO login(UserLoginDTO userLoginDTO);
    boolean validate(UserRegistrationDTO userRegistrationDTO);



}
