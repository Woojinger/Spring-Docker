package com.example.demo.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/api/login") // This means URL's start with /demo (after Application path)
public class LoginController {
	
	@PostMapping(path="") // Map ONLY POST Requests
	  public @ResponseBody String requestBody(@RequestBody Login login) {
		  Logger logger = LoggerFactory.getLogger(LoginController.class);
		  logger.info(login.getId());
		  logger.info(login.getPw());
		  if("abc".equals(login.getId()) && "def".equals(login.getPw())) {
			  return "Success";
		  }
		  return "Fail";
	  }
}
