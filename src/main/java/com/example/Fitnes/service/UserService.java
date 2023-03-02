package com.example.Fitnes.service;
import com.example.Fitnes.core.dto.users.UserCreateDTO;
import com.example.Fitnes.core.dto.users.UserLoginDTO;
import com.example.Fitnes.core.dto.users.UserRegistrationDTO;
import com.example.Fitnes.dao.api.IUserDao;
import com.example.Fitnes.dao.entity.UserEntity;
import com.example.Fitnes.service.api.IUserService;

import java.util.List;
import java.util.UUID;


public class UserService implements IUserService {
    private final IUserDao IUserDao;
    public UserService(IUserDao IUserDao){
        this.IUserDao = IUserDao;
    }
    public List<UserEntity> getAll() {
        return null;
    }

    @Override
    public boolean save(UserRegistrationDTO userRegistrationDTO) {
        UserEntity entity = new UserEntity(userRegistrationDTO);
        IUserDao.save(entity);
        return true;
    }

    @Override
    public UserCreateDTO getCard(UUID uuid) {
        return null;
    }

    @Override
    public boolean verification(String code, String mail) {
        return true;
    }

    @Override
    public UserLoginDTO login(UserLoginDTO userLoginDTO) {
        return null;
    }

    @Override
    public boolean validate(UserRegistrationDTO userRegistrationDTO) {
        return true;
    }
}