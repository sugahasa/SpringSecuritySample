package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.security.web.session.HttpSessionDestroyedEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyListener {
	
	@Autowired
	HttpServletRequest request;

	@EventListener
	public void handleSessionDestroyed(HttpSessionDestroyedEvent event​) {
		//log.debug("# SessionDestroyedEvent:" + event);
		System.out.println("## SessionDestroyedEvent");
		HttpSession session = request.getSession();
		
	}
}
