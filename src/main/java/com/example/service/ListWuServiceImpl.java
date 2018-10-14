package com.example.service;

import com.example.model.ParamUsersEntity;
import com.example.model.WuRequest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ParamServiceImpl extends CrudRepository<WuRequest, Long> {
    List<WuRequest> findByEmail(String email);
}
