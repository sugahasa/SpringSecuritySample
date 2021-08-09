package com.example.demo.controller.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/test")
@Slf4j
public class TestController {
	@GetMapping("/one")
	public ModelAndView test(HttpServletRequest request, ModelAndView mav){
		log.debug("TestController.one()");
		mav.addObject("test", "tester");
		mav.setViewName("/success");
		return mav;
	}
	
	@GetMapping("two")
	public String test(HttpServletRequest request, HttpServletResponse response){
		log.debug("TestController.one()");
		request.setAttribute("test", "tester");
		if(true) {
			throw new NullPointerException();
		}
		return "success";
	}


}
