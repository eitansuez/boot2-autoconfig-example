package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

  private final HelloService service;

  public Runner(HelloService service) {
    this.service = service;
  }

  @Override
  public void run(String... args) throws Exception {
    service.greet();
  }
}
