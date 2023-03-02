package com.example.Fitnes.service;

import com.example.Fitnes.core.dto.users.UserCreateDTO;
import com.example.Fitnes.core.dto.users.PageOfUserDTO;
import com.example.Fitnes.dao.api.IAdminDao;
import com.example.Fitnes.service.api.IAdminService;

import java.time.LocalDateTime;
import java.util.UUID;

public class AdminService implements IAdminService {

   private final IAdminDao IAdminDao;
   public AdminService(IAdminDao IAdminDao){
       this.IAdminDao = IAdminDao;
   }
    @Override
    public void addNewUser(UserCreateDTO userCreateDTO) {

    }

    @Override
    public UserCreateDTO getCard(UUID uuid) {
        return null;
    }

    @Override
    public UserCreateDTO update(UUID uuid, LocalDateTime dtUpdate, UserCreateDTO userCreateDTO) {
        return null;
    }

    @Override
    public PageOfUserDTO getPageOfUser(int number, int size) {
        return null;
    }
}
