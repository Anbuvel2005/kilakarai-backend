package com.kilakarai.kilakarai_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kilakarai.kilakarai_backend.entity.Snack;

@Repository
public interface SnackRepository extends JpaRepository<Snack, Integer> {

}