package com.example;

public final class ConsoleHelloService implements HelloService {
  private final String prefix;
  private final String suffix;

  public ConsoleHelloService(String prefix, String suffix) {
    this.prefix = (prefix == null ? "Hello" : prefix);
    this.suffix = (suffix == null ? "!" : suffix);
  }

  @Override
  public void greet() {
    String message = String.format("%s world%s", prefix, suffix);
    System.out.println(message);
  }
}
