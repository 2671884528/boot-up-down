package com.gyg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 郭永钢
 */
@EnableSwagger2
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
}
