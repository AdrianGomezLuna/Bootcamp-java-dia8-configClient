package com.nttdata.boocamp.configclient.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

	@Value("${some.value}")
	private String myValue;
	
	@RefreshScope
	@GetMapping(path="/myValue")
	public String myValue() {
		return this.myValue;
	}
}
