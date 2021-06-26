package com.example.demo.controller.contents;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {

	@Autowired
	private StringRedisTemplate redisTemplate;
	
  @GetMapping("/")
  public String index(HttpServletRequest request) {
    if (request.isUserInRole("ROLE_USER")) {
      log.debug("has ROLE_USER");
    }
    
    // 追加
    // RedisTest
    String sessionId = request.getSession().getId();
    String namespace = "namespace:";
    //redisTemplate.opsForValue().set(namespace + sessionId, "dummy");
    
    return "contents/index";
  }

  @GetMapping("menu")
  public String menu() {
    return "contents/menu";
  }

}
