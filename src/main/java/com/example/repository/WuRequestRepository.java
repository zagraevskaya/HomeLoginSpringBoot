package com.example.repository;


import com.example.model.WuRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("wuRequestRepository")
public interface WuRequestRepository extends JpaRepository<WuRequest, Integer>{
    List<WuRequest> findByEmail(String email);

    @Query("select b from WuRequest b where b.email = :email order by  b.dateRequest desc")
    List<WuRequest> findByNameOrder(@Param("email") String email);


}
