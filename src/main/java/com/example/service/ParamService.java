package com.example.service;

import com.example.model.ParamUsersEntity;

import java.util.List;

public interface ParamService {
    List<ParamUsersEntity> findByEmail(String email);
}
