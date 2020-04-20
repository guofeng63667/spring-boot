package com.crazy.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author guofeng@picooc.com
 * @Date 2020-04-08
 * @Version V1.0
 **/
@RestController
@RequestMapping("/risk")
public class RiskController {


	@GetMapping("/warning")
	public String hello(){
		return "hi,gf";
	}
}
