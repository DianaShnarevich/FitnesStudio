package com.example.Fitnes.core.dto.users;

import com.example.Fitnes.core.dto.users.enums.UserRole;
import com.example.Fitnes.core.dto.users.enums.UserStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserCreateDTO {
    private UUID uuid = UUID.randomUUID();
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;
    private String mail;
    private String fio;
    private String password;
    private UserStatus status = UserStatus.ACTIVATED;
    private UserRole role = UserRole.USER;


    public UserCreateDTO(UUID uuid, LocalDateTime dtCreate, LocalDateTime dtUpdate, String mail, String fio, String password, UserStatus status, UserRole role) {
        this.uuid = uuid;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
        this.mail = mail;
        this.fio = fio;
        this.password = password;
        this.status = status;
        this.role = role;
    }

    public UserCreateDTO(String mail, String fio, String password, UserStatus status, UserRole role) {
        this.mail = mail;
        this.fio = fio;
        this.password = password;
        this.status = status;
        this.role = role;
    }

    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public LocalDateTime getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
