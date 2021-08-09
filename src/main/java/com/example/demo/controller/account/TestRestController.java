package com.example.demo.controller.account;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/test")
@Slf4j
public class TestRestController {
	@GetMapping("three")
	public Map<String, Boolean> test3(HttpServletRequest request, HttpServletResponse response){
		log.debug("TestController.three()");
		Map<String, Boolean> testMap = new HashMap<>();
		testMap.put("test", false);
		return testMap;
	}
	
	@GetMapping("four")
	public Map<String, Boolean> test4(HttpServletRequest request, HttpServletResponse response){
		log.debug("TestController.four()");
		Map<String, Boolean> testMap = new HashMap<>();
		testMap.put("test", false);
		if(true) {
//			throw new NullPointerException();
			//throw new MyException();
		}
		return testMap;
	}


}
