package com.example.demo.configurer;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class MyExceptionHandler {

	 @ExceptionHandler({NullPointerException.class})
	 public ModelAndView handleNullPointerException(Exception e, ModelAndView mav){
		 log.debug("NullPointerException()");
		 mav.addObject("error", "error");
		 mav.setViewName("error");
		 return mav;
	 }
	
	 @ExceptionHandler({Exception.class})
	 public ModelAndView handleGrobalException(Exception e, ModelAndView mav){
		 log.debug("GrobalException()");
		 mav.addObject("error", "error");
		 mav.setViewName("error");
		 return mav;
	 }
}
