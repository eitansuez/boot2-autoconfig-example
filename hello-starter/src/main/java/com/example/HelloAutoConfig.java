package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(HelloService.class)
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfig {

  private final HelloProperties helloProperties;

  public HelloAutoConfig(HelloProperties helloProperties) {
    this.helloProperties = helloProperties;
  }

  @ConditionalOnMissingBean
  @Bean
  HelloService helloService() {
    return new ConsoleHelloService(
        helloProperties.getPrefix(),
        helloProperties.getSuffix()
    );
  }
}
