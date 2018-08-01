package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(HelloService.class)
@Configuration
public class HelloAutoConfig {

  @ConditionalOnMissingBean
  @Bean
  HelloService helloService() {
    return new ConsoleHelloService("Bonjour", ".");
  }
}
