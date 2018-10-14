package com.example.repository;

import com.example.model.ParamUsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ParamUsersEntity;

import java.util.List;

@Repository("paramUserRepository")
public interface ParamUserRepository extends JpaRepository<ParamUsersEntity, Integer>{
    List<ParamUsersEntity> findByEmail(String email);
}
