package com.example.gl.rabbit.config;


import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/7/21 Time: 23:12
 * \
 */
@Configuration
public class RabbitMqConfig {

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost",5672);
        //我这里直接在构造方法传入了
        //设置rabbitmq 服务端所在地址 我这里在本地就是本地 Host
        //        connectionFactory.setHost();
        //        connectionFactory.setPort();
        connectionFactory.setUsername("gl");
        connectionFactory.setPassword("123456");
        connectionFactory.setVirtualHost("testhost");
        //是否开启消息确认机制
        //connectionFactory.setPublisherConfirms(true);
        return connectionFactory;
    }


//    这个是根绝需要配置的tomcat,这里springboot就不需要了
//    @Bean
//    public TomcatServletWebServerFactory tomcatServletWebServerFactory(){
//        TomcatServletWebServerFactory tomcatServletWebServerFactory = new TomcatServletWebServerFactory(8069);
//        return tomcatServletWebServerFactory;
//    }

    //配置消费者声明队列的方式的一种方式!!!!!然后我们会有注解的方式去替代这边的配置和监控看RabbitMqUtilTwo
    //有自动确认到手动,这个里面还可以搞多个队列
//    @Bean
//    public SimpleMessageListenerContainer simpleMessageListenerContainer(){
//        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
//        //连接工厂
//        simpleMessageListenerContainer.setConnectionFactory(connectionFactory());
//        //这边参数有两个参数
//        //或者你可以写一个类继承这个MessageListener,然后把这个类放进来
//
//        //这边就可以监听还可以设置对应的队列信息
//        simpleMessageListenerContainer.setMessageListener(new MessageListener() {
//            @Override
//            public void onMessage(Message message) {
//
//            }
//        });
//        //这个地方就是搞搞队列的内容
//        //simpleMessageListenerContainer.addQueueNames("","","");
//        //simpleMessageListenerContainer.addQueues();
//        //是否自动确认还是手动确认//
//        //simpleMessageListenerContainer.setAcknowledgeMode(AcknowledgeMode.AUTO);
//        return ;
//    }

    //这个是spring封装好的一个api只用这个就能直接跟rabbitMq服务端进行交互
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
       //还可以set一次

        return rabbitTemplate;
    }


    //这边是配合消费者RabbitUtilTwo使用的
    @Bean
    public SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory(){
        SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory = new SimpleRabbitListenerContainerFactory();
        simpleRabbitListenerContainerFactory.setConnectionFactory(connectionFactory());
        //消息自动确认改成手动确认
        //none是不确认
        simpleRabbitListenerContainerFactory.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        //下面就是springboot消息欲取的设置
        simpleRabbitListenerContainerFactory.setPrefetchCount(2);
        return simpleRabbitListenerContainerFactory;
    }



    //这边是死信队列-------------------
    //思路生产者发送消息到一个deadQueue队列,然后直接拒绝,他会发送到死信交换机然后死信交换机会发送给deadQueue1队列
//    @Bean
//    public Queue queue() {
//        Map<String, Object> map = new HashMap<>();
//        //死信交换机的配置注意这里的key都不能乱改
//        map.put("x-dead-letter-exchange","deadExchange");
//        //死信交换机如果需要修改路由健
//        map.put("x-dead-letter-routing-key","xxx");
//        return new Queue("deadQueue", true,false,false,map);
//    }
//    @Bean
//    public Queue queue1() {
//        Map<String, Object> map = new HashMap<>();
//        return new Queue("deadQueue1", true,false,false,null);
//    }
//
//    //定义 一个死信交换机
//    @Bean
//    public DirectExchange directExchange(){
//        DirectExchange directExchange = new DirectExchange("deadExchange");
//                return directExchange;
//    }
//
//    //然后要绑定一下
//    @Bean
//    public Binding binding() {
//        //绑定一个队列  to: 绑定到哪个交换机上面 with：绑定的路由建（routingKey）
//        return BindingBuilder.bind(queue()).to(directExchange()).with("test.key");
//    }
    //这边是死信队列-------------------
}
