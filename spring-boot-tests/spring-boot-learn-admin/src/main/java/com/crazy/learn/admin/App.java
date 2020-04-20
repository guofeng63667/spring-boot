package com.crazy.learn.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author guofeng@picooc.com
 * @Date 2020-04-20
 * @Version V1.0
 **/
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class,args);
	}
}
