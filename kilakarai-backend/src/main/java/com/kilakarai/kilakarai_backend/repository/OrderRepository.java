package com.kilakarai.kilakarai_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kilakarai.kilakarai_backend.entity.Order;


public interface OrderRepository
        extends JpaRepository<Order,Long> {

}