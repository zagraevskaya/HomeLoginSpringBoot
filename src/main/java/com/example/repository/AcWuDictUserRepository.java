package com.example.repository;


import com.example.model.AcWuDictUserTermDiv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("AcWuDictUserRepository")
public interface AcWuDictUserRepository extends JpaRepository<AcWuDictUserTermDiv, Integer> {
    AcWuDictUserTermDiv findByEmail(String email);
}
