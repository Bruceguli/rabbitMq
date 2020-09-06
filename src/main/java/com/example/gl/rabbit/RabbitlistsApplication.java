package com.example.gl.rabbit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.gl.rabbit.redis.dao"})
public class RabbitlistsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitlistsApplication.class, args);
	}

}
