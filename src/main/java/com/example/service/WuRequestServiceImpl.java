package com.example.service;


import com.example.model.WuRequest;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WuRequestServiceImpl {

    public List<WuRequest> findByEmail(String email);
    public void saveWuRequest(WuRequest wuRequest);


}
