package com.crazy.learn;

import com.crazy.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author guofeng@picooc.com
 * @Date 2020-04-08
 * @Version V1.0
 **/
@SpringBootApplication
//@EnableTransactionManagement
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(App.class,args);
	}
}
