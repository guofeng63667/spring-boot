package com.crazy.learn.controller;

import com.crazy.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author guofeng@picooc.com
 * @Date 2020-04-08
 * @Version V1.0
 **/
@RestController
@RequestMapping("/test")
public class MyController {

	@Autowired
	private UserService userService;

	@GetMapping("/hello")
	public String hello(){
		return "hi,gf";
	}

	@GetMapping("/test50ms")
	public String test50ms(){
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "hi,gf";
	}


	@GetMapping("/test1000ms")
	public String test1000ms(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "hi,gf";
	}

	@GetMapping("/test500ms")
	public String test500ms(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "hi,gf";
	}

	@RequestMapping("/insert")
	public void insertModel(){
		userService.insert();
	}
}
