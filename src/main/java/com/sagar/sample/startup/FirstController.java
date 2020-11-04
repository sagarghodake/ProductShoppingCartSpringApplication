package com.sagar.sample.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.sagar.sample.controller")
public class FirstController {
	public static void main(String[] args) {
		SpringApplication.run(FirstController.class, args);
	}
}
/*
> netstat -ano | findstr *<port used>*

  TCP    0.0.0.0:*<port used>*  0.0.0.0:0              LISTENING       *<pid>*
  TCP    [::]:*<port used>*     [::]:0                 LISTENING       *<pid>*

> taskkill /F /PID *<pid>*
SUCCESS: The process with PID *<pid>* has been terminated.
*/