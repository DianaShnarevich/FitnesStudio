package com.example.Fitnes.dao.api;

import com.example.Fitnes.dao.entity.UserEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface IUserDao extends ListCrudRepository<UserEntity, UUID> {
}
