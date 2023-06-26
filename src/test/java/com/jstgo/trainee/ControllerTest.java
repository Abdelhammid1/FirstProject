package com.jstgo.trainee;

import org.junit.jupiter.api.Test;
import com.jstgo.test.Person;

class ControllerTest {

  @Test
  void test() {
    Person ahmed = new Person();
    ahmed.setPassword("value1");
    System.out.println(ahmed.getPassword());
  }
}