package com.kilakarai.kilakarai_backend.service;

import org.springframework.stereotype.Service;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;

import java.util.Map;

@Service
public class WhatsAppService {


    private final String ACCESS_TOKEN = "EAAX68qQhakQBRZBqlZBZCmSvHdkAE5detQpCWxCplJrJynZAXuumAEjPlvR0KDQ9I0ESBw5exb8BTBnNTWaC7VGDpH9rV0r2PDjAiJLF3ENIDq9ow1ZA6P1KBTZCA5ZAFA1SUZBVqzTfCDZCVVr1cwwQZA7zg1apm688eK1ZC2BLz98zM4d1AtGMvaK7W1OYxTwLEhz9GKH5URwOvtGc6pdgEwc46pn94CVzjZAytZBKg1HYrFly1hpBNerenVvadwodShbsr9EUV1AMAOmYg5b429wY1JOMZD";

    private final String PHONE_NUMBER_ID = "1229171713611125";


    public void sendMessage(String customerPhone, String customerName, Double amount) {


        String url =
                "https://graph.facebook.com/v23.0/"
                        + PHONE_NUMBER_ID
                        + "/messages";


        RestTemplate restTemplate = new RestTemplate();



        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        headers.setBearerAuth(ACCESS_TOKEN);



        String message =
                "Hi " + customerName + " 👋\n\n"
                        + "Your order has been confirmed 🎉\n\n"
                        + "Total Amount: ₹" + amount
                        + "\n\nThank you for ordering from Kilakarai Snacks ❤️";



        Map<String,Object> body = Map.of(

                "messaging_product",
                "whatsapp",

                "to",
                customerPhone,

                "type",
                "text",

                "text",
                Map.of(
                        "body",
                        message
                )

        );



        HttpEntity<Map<String,Object>> request =
                new HttpEntity<>(body, headers);



        ResponseEntity<String> response =
                restTemplate.postForEntity(
                        url,
                        request,
                        String.class
                );



        System.out.println("WhatsApp Response: "
                + response.getBody());

    }

}