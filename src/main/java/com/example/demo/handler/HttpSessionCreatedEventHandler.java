package com.example.demo.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.web.session.HttpSessionCreatedEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HttpSessionCreatedEventHandler implements ApplicationListener<HttpSessionCreatedEvent> {

	@Autowired
    private HttpServletRequest request; 
	
	@Autowired
	private StringRedisTemplate redisTemplate;
	
	@Override
    public void onApplicationEvent(HttpSessionCreatedEvent event) {
        log.debug("# HttpSessionCreatedEvent:" + event);
		// 追加
	    // RedisTest
	    String sessionId = request.getSession().getId();
	    String namespace = "namespace:";
	    redisTemplate.opsForValue().set(namespace + sessionId, "dummy2");
	}
}
