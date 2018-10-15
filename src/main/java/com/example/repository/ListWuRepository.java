package com.example.repository;

import com.example.model.WuRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("listWuRepository")
public interface ListWuRepository extends JpaRepository<WuRequest, Integer>{
    List<WuRequest> findByEmail(String email);
}
