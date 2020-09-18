//package com.example.gl.rabbit.send;
//
//import org.springframework.amqp.rabbit.connection.CorrelationData;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//public class RabbitMqProducerUntil {
//
//    @Autowired
//    RabbitTemplate rabbitTemplate;
//
//
////    @PostConstruct
////    public void init(){
////        rabbitTemplate.setConfirmCallback();
////    }
//
//    public void  sendMessage(){
//        CorrelationData correlationData = new CorrelationData("订单ID");
//        //direct.key
//        Map<String,Object> map = new HashMap<>();
//        map.put("name","123");
//        map.put("password","123456");//exchange
//        rabbitTemplate.convertAndSend("directExchangeTest2", "testQueue", map,correlationData);
//    }
//
//}
