package com.example.Fitnes.dao.api;

import com.example.Fitnes.dao.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IAdminDao extends CrudRepository<UserEntity, UUID> {
}
