package com.example.Fitnes.core.dto.users;

import com.example.Fitnes.core.dto.users.enums.UserRole;
import com.example.Fitnes.core.dto.users.enums.UserStatus;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class UserDTO {
    private UUID uuid;
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;
    private String mail;
    private String fio;
    private UserRole role;
    private UserStatus status;

    public UserDTO(UUID uuid, LocalDateTime dtCreate, LocalDateTime dtUpdate, String mail, String fio, UserStatus status, UserRole role) {
        this.uuid = uuid;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
        this.mail = mail;
        this.fio = fio;
        this.status = status;
        this.role = role;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(uuid, userDTO.uuid) && Objects.equals(mail, userDTO.mail) && Objects.equals(fio, userDTO.fio)
                && Objects.equals(role, userDTO.role) && Objects.equals(status, userDTO.status)
                && Objects.equals(dtCreate, userDTO.dtCreate) && Objects.equals(dtUpdate, userDTO.dtUpdate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(uuid, dtCreate, dtUpdate, fio, mail, role, status);
    }
    @Override
    public String toString() {
        return "UserDTO{" +
                "uuid=" + uuid +
                ", dt_create=" + dtCreate+
                ", dt_update=" + dtUpdate +
                ", mail=" + mail +
                ", fio=" + fio +
                ", role=" + role +
                ", status=" + status +
                ", dt_update" + dtUpdate + '\'' +
                '}';
    }
}
