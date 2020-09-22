package com.example.gl.rabbit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan({"com.example.gl.rabbit.redis.dao"})
@EnableSwagger2
public class RabbitlistsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitlistsApplication.class, args);
	}

}
