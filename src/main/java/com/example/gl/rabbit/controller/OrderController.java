package com.example.gl.rabbit.controller;

import com.example.gl.rabbit.send.RabbitMqProducerUntil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    @Autowired
    RabbitMqProducerUntil rabbitMqProducerUntil;

    @RequestMapping("/order.do")
    public  Object order(String message,String rouingKey,String name){
        rabbitMqProducerUntil.sendMessage();
        return null;
    }


}
