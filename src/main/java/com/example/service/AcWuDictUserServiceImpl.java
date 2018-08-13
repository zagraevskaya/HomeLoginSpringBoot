package com.example.service;

import com.example.model.AcWuDictUserTermDiv;
import com.example.model.ParamUsersEntity;

import java.util.List;

public interface AcWuDictUserServiceImpl {

   AcWuDictUserTermDiv findByEmail(String email);
}
