package com.springboot.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.mall.dao")
public class MallTylApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallTylApplication.class, args);
	}

}
