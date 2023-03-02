package com.example.Fitnes.service.api;

import com.example.Fitnes.core.dto.users.UserCreateDTO;
import com.example.Fitnes.core.dto.users.PageOfUserDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public interface IAdminService {
    void addNewUser(UserCreateDTO userCreateDTO);

    UserCreateDTO getCard(UUID uuid);

    UserCreateDTO update(UUID uuid, LocalDateTime dtUpdate, UserCreateDTO userCreateDTO);

    PageOfUserDTO getPageOfUser(int number, int size);

}
