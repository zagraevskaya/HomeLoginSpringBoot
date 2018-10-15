package com.example.service;

import com.example.model.WuRequest;
import com.example.repository.WuRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("wuRequestService")
public class WuRequestService implements WuRequestServiceImpl {

    @Qualifier("wuRequestRepository")
    @Autowired
    private WuRequestRepository wuRequestRepository;

    @Override
    public List<WuRequest> findByEmail(String email) {

        return wuRequestRepository.findByEmail(email);
    }

    @Override
    public void saveWuRequest(WuRequest wuRequest) {

        wuRequestRepository.save(wuRequest);
    }


    public List<WuRequest> queryByEmail(String email) {

        return wuRequestRepository.findByNameOrder(email);
    }



}
