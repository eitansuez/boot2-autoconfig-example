package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="hello")
public class HelloProperties {

  /**
   * The prefix for the greeting.
   */
  private String prefix = "Hello";

  /**
   * Placed at the end of the greeting.
   */
  private String suffix = "!";

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }
}
