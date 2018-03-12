package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloAutoConfig {

  @Bean
  HelloService helloService() {
    return new ConsoleHelloService("Bonjour", ".");
  }
}
