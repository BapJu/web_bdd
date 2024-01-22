package com.example.web_bdd.dao.impl;
import com.example.web_bdd.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}