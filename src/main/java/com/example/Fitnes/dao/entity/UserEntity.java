package com.example.Fitnes.dao.entity;


import com.example.Fitnes.core.dto.users.UserCreateDTO;
import com.example.Fitnes.core.dto.users.UserRegistrationDTO;
import com.example.Fitnes.core.dto.users.enums.UserRole;
import com.example.Fitnes.core.dto.users.enums.UserStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(schema = "app", name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "dt_create")
    private LocalDateTime dtCreate;
    @Column(name = "dt_update")
    @Version
    private LocalDateTime dtUpdate;

    @Column(name = "mail")
    private String mail;

    @Column(name = "fio")
    private String fio;

    @Column(name = "role")
    private UserRole role;
    @Column(name = "status")
    private UserStatus status;

    @Column(name = "password")
    private String password;


    @Column(name = "code")
    private int verificationCode;

    public UserEntity() {
    }

    public UserEntity(UserRegistrationDTO userRegistrationDTO) {
        this.uuid = UUID.randomUUID();
        this.dtCreate = LocalDateTime.now();
        this.dtUpdate = LocalDateTime.now();
        this.mail = userRegistrationDTO.getMail();
        this.fio = userRegistrationDTO.getFio();
        this.role = UserRole.USER;
        this.status = UserStatus.WAITING_ACTIVATION;
        this.password = userRegistrationDTO.getPassword();
        this.verificationCode =  (int)  (Math.random() * 10000);
    }

    public UserEntity(UserCreateDTO userCreateDTO) {
        this.uuid = UUID.randomUUID();
        this.dtCreate = LocalDateTime.now();
        this.dtUpdate = LocalDateTime.now();
        this.mail = mail;
        this.fio = fio;
        this.role = role;
        this.status = status;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(uuid, that.uuid) && Objects.equals(dtCreate, that.dtCreate) && Objects.equals(dtUpdate, that.dtUpdate)
                && Objects.equals(mail, that.mail) && Objects.equals(fio, that.fio) && role == that.role && status == that.status && Objects.equals(password, that.password);
    }


    @Override
    public int hashCode() {
        return Objects.hash(uuid, dtCreate, dtUpdate, mail, fio, role, status, password);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "uuid=" + uuid +
                ", dtCreate=" + dtCreate +
                ", dtUpdate=" + dtUpdate +
                ", mail='" + mail + '\'' +
                ", fio='" + fio + '\'' +
                ", role=" + role +
                ", status=" + status +
                ", password='" + password + '\'' +

                '}';
    }
}
