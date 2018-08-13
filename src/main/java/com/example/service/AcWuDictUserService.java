package com.example.service;

import com.example.model.AcWuDictUserTermDiv;
import com.example.repository.AcWuDictUserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("AcWuDictUserService")
public class AcWuDictUserService implements AcWuDictUserServiceImpl {

    @Qualifier("AcWuDictUserRepository")
    @Autowired
    private AcWuDictUserRepository acWuDictUserRepository;


    @Override
    public AcWuDictUserTermDiv findByEmail(String email) {
        return acWuDictUserRepository.findByEmail(email);
    }
}
