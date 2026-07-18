package com.kilakarai.kilakarai_backend.controller;


import org.springframework.web.bind.annotation.*;

import com.kilakarai.kilakarai_backend.entity.Order;
import com.kilakarai.kilakarai_backend.repository.OrderRepository;
import com.kilakarai.kilakarai_backend.service.WhatsAppService;


@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/orders")
public class OrderController {


    private final OrderRepository orderRepository;

    private final WhatsAppService whatsappService;



    public OrderController(
            OrderRepository orderRepository,
            WhatsAppService whatsappService
    ){

        this.orderRepository = orderRepository;
        this.whatsappService = whatsappService;

    }




    @PostMapping
    public Order saveOrder(@RequestBody Order order){


        // Save order in Oracle database
        Order savedOrder = orderRepository.save(order);



        // Send WhatsApp confirmation
        whatsappService.sendMessage(
                savedOrder.getPhone(),
                savedOrder.getCustomerName(),
                savedOrder.getTotalAmount()
        );



        return savedOrder;

    }

}