package com.example.service;


import com.example.model.WuRequest;
import com.example.repository.ListWuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("listWuService")
public class ListWuService implements ListWuServiceImpl {
    @Qualifier("listWuRepository")
    @Autowired
    private ListWuRepository listWuRepository;


    @Override
    public List<WuRequest> findByEmail(String email) {
        return listWuRepository.findByEmail(email);
    }

    @Override
    public <S extends WuRequest> S save(S s) {
        return null;
    }

    @Override
    public <S extends WuRequest> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<WuRequest> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<WuRequest> findAll() {
        return null;
    }

    @Override
    public Iterable<WuRequest> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(WuRequest wuRequest) {

    }

    @Override
    public void deleteAll(Iterable<? extends WuRequest> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
