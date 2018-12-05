package com.example.peer3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
//@EnableDiscoveryClient//启用服务注册与发现
@EnableFeignClients//启用feign进行远程调用
//@EnableEurekaServer
@EnableHystrixDashboard
@EnableHystrix
//@EnableCircuitBreaker
@EnableTurbine
public class Peer3Application {

	public static void main(String[] args) {
		SpringApplication.run(Peer3Application.class, args);
	}
}
