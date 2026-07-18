package com.kilakarai.kilakarai_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kilakarai.kilakarai_backend.entity.Snack;
import com.kilakarai.kilakarai_backend.service.SnackService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class SnackController {

    @Autowired
    private SnackService snackService;

    @GetMapping("/snacks")
    public List<Snack> getAllSnacks() {
        return snackService.getAllSnacks();
    }
}