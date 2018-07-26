package com.example.service;

import com.example.model.ParamUsersEntity;

import java.util.List;

public interface ParamServiceImpl {
    List<ParamUsersEntity> findByEmail(String email);
}
