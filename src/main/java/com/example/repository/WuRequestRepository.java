package com.example.repository;


import com.example.model.ParamUsersEntity;
import com.example.model.WuRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository("wuRequestRepository")
public interface WuRequestRepository extends JpaRepository<WuRequest, Integer>{
    WuRequest findByEmail(String email);

}
