package com.jstgo.test;

public class Person {

  private String password;

  public void setPassword(String password) {
    if (password.length() >= 6) {
      this.password = password;
    }
  }

  public String getPassword() {
    return password;
  }
}
