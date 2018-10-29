package com.example.service;


import com.example.model.WuRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface WuRequestServiceImpl {

    List<WuRequest> findByEmail(String email);
    void saveWuRequest(WuRequest wuRequest);
    WuRequest findByWuId(Integer id);

    List<WuRequest> findByNameOrderDesc(String email);
    List<WuRequest> findByNameOrderAbs(String email);

    Page<WuRequest> search(String term, int printYear, Pageable pageable);
    Page<WuRequest> search(String term, int printYear, boolean readAlReady, Pageable pageable);

    Page<WuRequest> findByAmount(String name, Pageable page);
    Page<WuRequest> listWuRequest(Pageable page);

    Page<WuRequest> findByPrimaryState(int ready,Pageable pageRequest);


}
