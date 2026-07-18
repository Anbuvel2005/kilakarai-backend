package com.kilakarai.kilakarai_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kilakarai.kilakarai_backend.entity.Snack;
import com.kilakarai.kilakarai_backend.repository.SnackRepository;

@Service
public class SnackService {

    @Autowired
    private SnackRepository snackRepository;

    public List<Snack> getAllSnacks() {
        return snackRepository.findAll();
    }

}