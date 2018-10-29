package com.example.repository;


import com.example.model.WuRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository("wuRequestRepository")
public interface WuRequestRepository extends JpaRepository<WuRequest, Long> {
    List<WuRequest> findByEmail(String email);

    @Query("select b from WuRequest b where b.email = :email order by  b.dateRequest desc")
    List<WuRequest> findByNameOrderDesc(@Param("email") String email);

    @Query("select b from WuRequest b where b.email = :email order by  b.dateRequest")
    List<WuRequest> findByNameOrderAbs(@Param("email") String email);

    @Query("select b from WuRequest b where b.id = :id")    //This is using a named query method
    WuRequest findByWuId(@Param("id") Integer id);

    Page<WuRequest> findByCurrency(String name, Pageable page);


    @Query("SELECT t FROM WuRequest t ")
    Page<WuRequest> listWuRequest(
            Pageable pageRequest
    );


    @Query("SELECT t FROM WuRequest t WHERE " +
            " t.primaryState > :ready")
    Page<WuRequest> findByPrimaryState(
            @Param("ready") int ready,
            Pageable pageRequest
    );

    @Query("SELECT t FROM WuRequest t WHERE " +
            "(LOWER(t.amount) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
            "LOWER(t.amountSend) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
            "LOWER(t.email) LIKE LOWER(CONCAT('%', :searchTerm, '%'))) " +
            "AND t.amount > :printYear")
    Page<WuRequest> findBySearchParams(
            @Param("searchTerm") String searchTerm,
            @Param("printYear") int printYear,
            Pageable pageRequest
    );

    @Query("SELECT t FROM WuRequest t WHERE " +
            "(LOWER(t.amount) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
            "LOWER(t.amountSend) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
            "LOWER(t.email) LIKE LOWER(CONCAT('%', :searchTerm, '%'))) " +
            "AND t.amount > :printYear AND t.primaryState = :readAlReady")
    Page<WuRequest> findBySearchParamsAndReadAlready(
            @Param("searchTerm") String searchTerm,
            @Param("printYear") int printYear,
            @Param("readAlReady") boolean readAlReady,
            Pageable pageRequest
    );


}
