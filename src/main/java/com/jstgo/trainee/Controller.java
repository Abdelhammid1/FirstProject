package com.jstgo.trainee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("test")
public class Controller {

  @GetMapping(value = "something", produces = "application/json")
  String testGet() {
    return "test Successful";
  }

  @PostMapping(value = "/test", produces = "application/json")
  String testPost(@RequestBody String value) {
    return "variable: " + value;
  }
}
