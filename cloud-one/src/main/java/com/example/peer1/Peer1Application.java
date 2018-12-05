package com.example.peer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient//添加@EnableDiscoveryClient注解后 项目就具有了服务注册的功能。启动工程后，就可以在注册中心的页面看到SPRING-CLOUD-PRODUCER服务
public class Peer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Peer1Application.class, args);
	}
}
