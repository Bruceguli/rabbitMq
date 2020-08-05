package com.example.gl.rabbit.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.rabbitmq.client.Channel;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * 这边是监听对应的队列,消费者
 */
@Component
public class RabbitMqConsumerUtil {

    @RabbitListener(queues = "testQueue")
    public void get(Map<String,Object> map) throws Exception{
        for(String key : map.keySet()){
            System.out.println(key);
        }
//value
        for(Object value : map.values()){
            System.out.println(value);
        }
        //System.out.println(new String(message.getBody(),"UTF-8"));
        System.out.println("消费者1");
    }


//    @RabbitListener(queues = "testQueue")
//    public  void  get1(Message message,String string) throws UnsupportedEncodingException {
//        System.out.println(message);
//        System.out.println(new String(message.getBody(),"UTF-8"));
//        System.out.println("消费者2");
//    }
}
