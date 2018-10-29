package com.example.service;

import com.example.model.WuRequest;
import com.example.repository.WuRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
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

    public List<WuRequest> findByNameOrderDesc(String email) {

        return wuRequestRepository.findByNameOrderDesc(email);
    }

    public List<WuRequest> findByNameOrderAbs(String email) {
        return wuRequestRepository.findByNameOrderAbs(email);
    }



    @Override
    @Transactional(readOnly = true)
    public Page<WuRequest> search(String term, int printYear, Pageable pageable) {
      //return null;
          return wuRequestRepository.findBySearchParams(term, printYear, pageable);

    }

    @Override
    @Transactional(readOnly = true)
    public Page<WuRequest> search(String term, int printYear, boolean readAlReady, Pageable pageable) {
        //return null;
        return wuRequestRepository.findBySearchParamsAndReadAlready(term, printYear, readAlReady, pageable);
    }

    @Override
    public Page<WuRequest> findByAmount(String name, Pageable page) {
        return wuRequestRepository.findByCurrency(name,page);
    }

    @Override
    public Page<WuRequest> listWuRequest(Pageable page) {
        return wuRequestRepository.listWuRequest(page);
    }

    @Override
    public Page<WuRequest> findByPrimaryState(int ready, Pageable pageRequest) {
        return wuRequestRepository.findByPrimaryState(ready,pageRequest);
    }

    public WuRequest findByWuId(Integer id) {
        return wuRequestRepository.findByWuId(id);
    }
}



