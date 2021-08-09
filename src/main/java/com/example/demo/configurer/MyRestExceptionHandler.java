package com.example.demo.configurer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class MyRestExceptionHandler {

	 @ExceptionHandler({NullPointerException.class})
	 public Map<String, Exception> handleNullPointerException(Exception e){
		 log.debug("RestNullPointerException()");
		Map<String, Exception> testMap = new HashMap<>();
		testMap.put("exception", e);
		return testMap;
	 }
	
	 @ExceptionHandler({Exception.class})
	 public Map<String, Exception> handleGrobalException(Exception e){
		 log.debug("RestGrobalException()");
		Map<String, Exception> testMap = new HashMap<>();
		testMap.put("exception", e);
		return testMap;
	 }
}
