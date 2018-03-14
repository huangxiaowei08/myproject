package com.spring.boot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot的启动类要放到controller的父包中
 * 否则会影响controller的扫描，导致不能请求到controller
 */
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
	    SpringApplication.run(Application.class, args);
	  }

}
