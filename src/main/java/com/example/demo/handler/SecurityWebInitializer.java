package com.example.demo.handler;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer {
	// 作成
	@Override
	protected boolean enableHttpSessionEventPublisher() {
		return true;
	}
}
