package com.Suresh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

	private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

	@Value("${message}")
	private String message;

	@GetMapping("/msg1")
	public String getMessage() {
		logger.info("************* entered into getMessage() **************");
		System.out.println("message in console  \n " + message);
		return this.message;
	}
}