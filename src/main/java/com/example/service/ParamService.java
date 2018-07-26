package com.example.service;

import com.example.model.ParamUsersEntity;
import com.example.repository.ParamUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("paramService")
public class ParamService implements ParamServiceImpl {
    @Qualifier("paramUserRepository")
    @Autowired
    private ParamUserRepository paramUserRepository;


    @Override
    public List<ParamUsersEntity> findByEmail(String email) {
        return paramUserRepository.findByEmail(email);
    }
}
