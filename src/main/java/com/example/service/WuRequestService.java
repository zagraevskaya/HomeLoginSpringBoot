package com.example.service;

import com.example.model.WuRequest;
import com.example.repository.UserRepository;
import com.example.repository.WuRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("wuRequestService")
public class WuRequestService implements WuRequestServiceImpl {

    @Qualifier("wuRequestRepository")
    @Autowired
    private WuRequestRepository wuRequestRepository;

    @Override
    public WuRequest findUserByEmail(String email) {
        return wuRequestRepository.findByEmail(email);
    }

    @Override
    public void saveWuRequest(WuRequest wuRequestEntity) {
          wuRequestRepository.save(wuRequestEntity);
    }
}
